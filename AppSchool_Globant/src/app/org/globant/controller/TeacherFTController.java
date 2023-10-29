package app.org.globant.controller;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.model.Subject;
import app.org.globant.model.TeacherFullTime;

public class TeacherFTController {

    public static void findTeachersFT(ArrayList<TeacherFullTime> teacherFullTimes) {
        int count = 0;
        for (TeacherFullTime teacherFullTime : teacherFullTimes) {
            String salary = String.format("%.2f", teacherFullTime.calculatedSalary());
            count++;
            System.out.println(
                    count + ". Name: " + teacherFullTime.getName() + " Salary: $" + salary);
        }
    }

    public static void choiceTeacherFT(ArrayList<TeacherFullTime> teacherFullTimes,
            Subject subject, Scanner sc) {

        findTeachersFT(teacherFullTimes);
        System.out.println("Choice the number:");
        int choiceTeacher = sc.nextInt();
        sc.nextLine();
        TeacherFullTime teacherFullTime = teacherFullTimes.get(choiceTeacher - 1);
        subject.setTeacherFullTime(teacherFullTime);

    }
}
