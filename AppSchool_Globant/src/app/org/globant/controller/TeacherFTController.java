package app.org.globant.controller;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.model.Subject;
import app.org.globant.model.TeacherFullTime;

public class TeacherFTController {

    /**
     * @param teacherFullTimes Lista de profesores full time
     */
    public static void findTeachersFT(ArrayList<TeacherFullTime> teacherFullTimes) {
        int count = 0;
        for (TeacherFullTime teacherFullTime : teacherFullTimes) {
            String salary = String.format("%.2f", teacherFullTime.calculatedSalary());
            count++;
            System.out.println(
                    count + ". Name: " + teacherFullTime.getName() + " Salary: $" + salary);
        }
    }

    /**
     * @param teacherFullTimes Lista de profesores full time
     * @param subject          materia donde se agrega el nuevo profesor
     * @param sc               Método Scanner
     */
    public static void choiceTeacherFT(ArrayList<TeacherFullTime> teacherFullTimes,
            Subject subject, Scanner sc) {
        boolean condition = false;
        do {
            System.out.println("\nTeachers Full Time:");
            findTeachersFT(teacherFullTimes);
            System.out.println("Choice the number:");
            int choiceTeacher = sc.nextInt();
            sc.nextLine();
            if (choiceTeacher <= teacherFullTimes.size() && choiceTeacher > 0) {
                TeacherFullTime teacherFullTime = teacherFullTimes.get(choiceTeacher - 1);
                subject.setTeacherFullTime(teacherFullTime);
                condition = true;
            } else {
                System.out.println("Invalid range. Please enter a valid option.");
            }
        } while (!condition);

    }
}
