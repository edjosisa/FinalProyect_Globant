package app.org.globant.view;

import java.util.ArrayList;


import app.org.globant.controller.TeacherPTController;

import app.org.globant.model.TeacherPartTime;

public class TeacherPartTimeView {
    /**
     * @param teacherPartTimes Lista de profesores part time
     */
    public void showAllProfessorsPT(ArrayList<TeacherPartTime> teacherPartTimes) {

        System.out.println("\nTeacher part time: ");
        TeacherPTController.findTeachersPT(teacherPartTimes);
    }

}
