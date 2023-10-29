package app.org.globant.controller;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.model.Student;
import app.org.globant.model.Subject;
import app.org.globant.model.TeacherFullTime;
import app.org.globant.model.TeacherPartTime;

public class SubjectController {

    public static void findClasses(ArrayList<Subject> subjects) {
        int count = 0;
        for (Subject subject : subjects) {
            count++;
            System.out.println(count + ". " + subject.getName());
        }
    }

    public static void infoClass(ArrayList<Subject> subjects, int choice) {

        System.out.println("Classroom: " + subjects.get(choice - 1).getClassroom());
        if (subjects.get(choice - 1).getTeacherFullTime() != null) {

            System.out.println("Teacher: " + subjects.get(choice - 1).getTeacherFullTime().getName());
        } else {
            System.out.println("Teacher: " + subjects.get(choice - 1).getTeacherPartTime().getName());
        }
        System.out.println("Students:");
        int count = 0;
        for (Student student : subjects.get(choice - 1).getsList()) {
            count++;
            System.out.println(count + ". " + student.getName());
        }
    }

    public Subject createClass(ArrayList<TeacherFullTime> teacherFullTimes, ArrayList<TeacherPartTime> teacherPartTimes,
            ArrayList<Student> students, Scanner sc) {

        System.out.println("Enter class name: ");
        String name = sc.nextLine();
        System.out.println("Enter classroom: ");
        String classroom = sc.nextLine();
        Subject newClass = new Subject(name, classroom);
        System.out.println("Choice type Teacher(part time or full time): ");
        String typeTeacher = sc.nextLine().toLowerCase().replace(" ", "");
        if (typeTeacher.equals("fulltime")) {
            TeacherFTController.choiceTeacherFT(teacherFullTimes, newClass, sc);
        } else {
            TeacherPTController.choiceTeacherPT(teacherPartTimes, newClass, sc);
        }
        StudentController.choiceStudents(students, newClass, sc);

        return newClass;
    }

    public ArrayList<Subject> findClassByStudent(int id, ArrayList<Student> sList, ArrayList<Subject> suList) {
        ArrayList<Subject> classByStudent = new ArrayList<>();
        Student student = StudentController.findStudentById(id, sList);

        if (student != null) {
            for (Subject subject : suList) {
                if (subject.getsList().contains(student)) {
                    classByStudent.add(subject);
                }
            }
        }
        return classByStudent;

    }
}
