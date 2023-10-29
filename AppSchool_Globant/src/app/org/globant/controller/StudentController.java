package app.org.globant.controller;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.model.Student;
import app.org.globant.model.Subject;

public class StudentController {

    public static Student findStudentById(int id, ArrayList<Student> sList) {

        for (Student student : sList) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public Student createStudent(ArrayList<Student> students, Scanner sc) {
        boolean condition = false;
        int id = 0;

        while (!condition) {
            System.out.println("Enter student Id: ");
            id = sc.nextInt();
            sc.nextLine();
            for (Student student : students) {
                if (student.getId() == id) {
                    System.out.println("Id is already in use by another student. Please enter a different ID.");
                    condition = false;
                } else {
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

    public int StudentId(Scanner sc) {
        System.out.println("Enter Student Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    public static void ClassesByStudent(ArrayList<Subject> subjects, Student student) {
        int count = 0;

        System.out.println(student.getName());
        for (Subject subject : subjects) {
            count++;
            System.out.println(count + ". Class name: " + subject.getName() + " Classroom: " + subject.getClassroom());
        }
    }

}
