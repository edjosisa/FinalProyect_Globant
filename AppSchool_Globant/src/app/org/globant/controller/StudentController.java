package app.org.globant.controller;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.model.Student;
import app.org.globant.model.Subject;

public class StudentController {

    /**
     * @param id Identifiacdor único del estudiante
     * @param sList Lista de materias
     * @return Una instancia de estudiante
     */
    public static Student findStudentById(int id, ArrayList<Student> sList) {

        for (Student student : sList) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    /**
     * @param students Lista de estudiantes
     * @param sc método Scanner
     * @return Un nuevo estudiante
     */
    public Student createStudent(ArrayList<Student> students, Scanner sc) {
        boolean condition = false;
        int id = 0;

        while (!condition) {
            System.out.println("Enter student Id: ");
            id = sc.nextInt();
            sc.nextLine();
            condition = true;
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Id is already in use by another student. Please enter a different ID.");
                    condition = false;
                    break;
                }
            }
        }
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();

        return new Student(name, id, age);
    }

    /**
     * @param students Lista de estudiantes
     * @param subject Materia donde se agrega al estudiante
     * @param sc método Scanner
     */
    public static void choiceStudents(ArrayList<Student> students, Subject subject, Scanner sc) {
        int count = 0;
        boolean condition = false;
        System.out.println("Existing Student");
        for (Student student : students) {
            count++;
            System.out.println(count + ". " + student.getName());
        }

        do {
            System.out.println("Choice the Student");
            int choice = sc.nextInt();
            sc.nextLine();
            Student student = students.get(choice - 1);
            subject.addStudent(student);
            System.out.println("Do you want to add other student?(Y/n)");
            String option = sc.nextLine().toLowerCase().replace("yes", "y").replace("no", "n");

            if (option.equals("y")) {
                condition = false;
            } else {
                condition = true;
            }

        } while (!condition);
    }

    /**
     * @param sc Método Scanner
     * @return el identificador único del estudiante
     */
    public int StudentId(Scanner sc) {
        System.out.println("Enter Student Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    /**
     * @param subjects Lista de materias
     * @param student Estudiante elegido para obtener la información
     */
    public static void ClassesByStudent(ArrayList<Subject> subjects, Student student) {
        int count = 0;

        System.out.println(student.getName());
        for (Subject subject : subjects) {
            count++;
            System.out.println(count + ". Class name: " + subject.getName() + " Classroom: " + subject.getClassroom());
        }
    }

}
