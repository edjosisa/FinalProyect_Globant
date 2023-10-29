package app.org.globant.view;

import java.util.ArrayList;
import java.util.Scanner;

import app.org.globant.controller.TeacherFTController;
import app.org.globant.model.Subject;
import app.org.globant.model.TeacherFullTime;

public class TeacherFullTimeView {

    /**
     * @param teacherFullTimes Lista de profesores
     */
    public void showAllProfessorsFT(ArrayList<TeacherFullTime> teacherFullTimes) {

        System.out.println("\nTeacher full time: ");
        TeacherFTController.findTeachersFT(teacherFullTimes);

    }


}
