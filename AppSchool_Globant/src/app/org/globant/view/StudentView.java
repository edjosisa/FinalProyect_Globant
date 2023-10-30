package app.org.globant.view;

import java.util.ArrayList;

import app.org.globant.controller.StudentController;
import app.org.globant.model.Student;
import app.org.globant.model.Subject;

public class StudentView {

    /**
     * @param subjects Lista de materias
     * @param student  Estudiante por el cual se va a buscar las materias
     */
    public void showClassesByStudent(ArrayList<Subject> subjects, Student student) {

        System.out.println("Student");
        StudentController.ClassesByStudent(subjects, student);
    }
}
