package app.org.globant.controller;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.model.Subject;

import app.org.globant.model.TeacherPartTime;

public class TeacherPTController {

    /**
     * @param teacherPartTimes Lista de profesores part time.
     */
    public static void findTeachersPT(ArrayList<TeacherPartTime> teacherPartTimes) {
        int count = 0;
        for (TeacherPartTime teacherPartTime : teacherPartTimes) {
            String salary = String.format("%.2f", teacherPartTime.calculatedSalary());
            count++;
            System.out.println(
                    count + ". Name: " + teacherPartTime.getName() + " Salary: $" + salary);
        }
    }

    /**
     * @param teacherPartTimes Lista de profesores part time.
     * @param subject materia donde se agrega el nuevo profesor
     * @param sc Método Scanner
     */
    public static void choiceTeacherPT(ArrayList<TeacherPartTime> teacherPartTimes,
            Subject subject, Scanner sc) {

        System.out.println("Existing teacher");

        System.out.println("\nTeacher Part Time");
        findTeachersPT(teacherPartTimes);

        System.out.println("Choice the number:");
        int choiceTeacher = sc.nextInt();
        sc.nextLine();
        TeacherPartTime teacherPartTime = teacherPartTimes.get(choiceTeacher - 1);
        subject.setTeacherPartTime(teacherPartTime);

    }

}
