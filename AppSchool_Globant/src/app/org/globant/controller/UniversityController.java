package app.org.globant.controller;

import app.org.globant.model.Student;
import app.org.globant.model.Subject;
import app.org.globant.model.University;
import app.org.globant.view.UniversityView;

public class UniversityController {
    private University model;
    private UniversityView view;

    public UniversityController(University model, UniversityView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        int choice;
        do {
            view.showMenu();
            choice = view.getInput();
            switch (choice) {
                case 1:
                    view.printAllProfessors(model.getTfList(), model.getTpList());
                    break;
                case 2:
                    view.printAllClasses(model.getSuList());
                    view.showSubMenu();
                    int choice1 = view.getInput();
                    UniversityView.printInfoClass(model.getSuList(), choice1);
                    break;
                case 3:
                    Student newStudent = view.createStudent();
                    model.addStudent(newStudent);
                    break;
                case 4:
                    Subject newClass = view.createClass(model.getTfList(), model.getTpList(), model.getsList());
                    model.addSubject(newClass);
                    break;
                case 5:
                    int studentId = view.StudentId();
                    Student student = model.findStudentById(studentId);
                    if (student != null) {
                        view.showClassesByStudent(model.findClassByStudent(studentId), student);
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
