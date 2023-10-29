package app.org.globant.view;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.controller.TeacherFTController;
import app.org.globant.model.Subject;
import app.org.globant.model.TeacherFullTime;

public class TeacherFullTimeView {

    public void showAllProfessorsFT(ArrayList<TeacherFullTime> teacherFullTimes) {

        System.out.println("\nTeacher full time: ");
        TeacherFTController.findTeachersFT(teacherFullTimes);

    }

    public void showTeachersFT(ArrayList<TeacherFullTime> teacherFullTimes, Subject subject, Scanner sc) {

        System.out.println("Existing teacher");
        System.out.println("\nTeacher Full Time");
        TeacherFTController.choiceTeacherFT(teacherFullTimes, subject, sc);
    }
}
