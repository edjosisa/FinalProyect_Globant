package app.org.globant.controller;

import java.util.Scanner;

import app.org.globant.model.Student;
import app.org.globant.model.Subject;
import app.org.globant.model.University;
import app.org.globant.view.UniversityView;

public class UniversityController {
    Scanner sc = new Scanner(System.in);
    private University model;
    private UniversityView view;
    private SubjectController subjectController;
    private StudentController studentController;
    private static UniversityController instance = null;

    /**
     * @param model Modelo para obtener información
     * @param view  Vista de lo que muestra al usuario
     */
    private UniversityController(University model, UniversityView view) {
        this.model = model;
        this.view = view;
        subjectController = new SubjectController();
        studentController = new StudentController();

    }

    public static UniversityController getInstance(University model, UniversityView view) {
        if (instance == null) {
            instance = new UniversityController(model, view);
        }
        return instance;
    }

    /**
     * @return La opción que el usuario elige.
     */
    public int getInput() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;

    }

    /**
     * Inicia el programa.
     */
    public void run() {
        int choice;
        do {
            view.showMenu();
            choice = getInput();
            switch (choice) {
                case 1:
                    view.getTeacherFullTimeView().showAllProfessorsFT(model.getTfList());
                    view.getTeacherPartTimeView().showAllProfessorsPT(model.getTpList());
                    // view.printAllProfessors(model.getTfList(), model.getTpList());
                    break;
                case 2:
                    boolean condition = false;
                    view.getSubjectView().showAllClasses(model.getSuList());
                    do {
                        view.showSubMenu();
                        int choice1 = getInput();
                        if (choice1 <= model.getSuList().size() && choice1 > 0) {
                            view.getSubjectView().showInfoClass(model.getSuList(), choice1);
                            condition = true;
                        } else {
                            System.out.println("Invalid range. Please enter a valid option.");

                        }

                    } while (!condition);

                    break;
                case 3:
                    Student newStudent = studentController.createStudent(model.getsList(), sc);
                    model.addStudent(newStudent);
                    break;
                case 4:
                    Subject newClass = subjectController.createClass(model.getTfList(), model.getTpList(),
                            model.getsList(), sc);
                    model.addSubject(newClass);
                    break;
                case 5:
                    int studentId = studentController.StudentId(sc);
                    Student student = StudentController.findStudentById(studentId, model.getsList());
                    if (student != null) {
                        view.getStudentView().showClassesByStudent(
                                subjectController.findClassByStudent(studentId, model.getsList(), model.getSuList()),
                                student);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 6:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 6);
    }
}
