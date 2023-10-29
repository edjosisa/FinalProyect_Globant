package app.org.globant.view;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.controller.TeacherPTController;
import app.org.globant.model.Subject;
import app.org.globant.model.TeacherPartTime;

public class TeacherPartTimeView {
    public void showAllProfessorsPT(ArrayList<TeacherPartTime> teacherPartTimes) {

        System.out.println("\nTeacher part time: ");
        TeacherPTController.findTeachersPT(teacherPartTimes);
    }

    public void showTeachersPT(ArrayList<TeacherPartTime> teacherPartTimes, Subject subject, Scanner sc) {

        System.out.println("Existing teacher");
        System.out.println("\nTeacher Part Time");
        TeacherPTController.choiceTeacherPT(teacherPartTimes, subject, sc);
    }
}
