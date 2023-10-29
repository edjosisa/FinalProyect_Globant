package app.org.globant.view;

import java.util.ArrayList;

import app.org.globant.controller.StudentController;
import app.org.globant.model.Student;
import app.org.globant.model.Subject;

public class StudentView {

    public void showClassesByStudent(ArrayList<Subject> subjects, Student student) {

        System.out.println("Student");
        StudentController.ClassesByStudent(subjects, student);
    }
}
