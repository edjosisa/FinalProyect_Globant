package app.org.globant.view;

import java.util.ArrayList;

import app.org.globant.controller.SubjectController;
import app.org.globant.model.Subject;

public class SubjectView {

    /**
     * @param subjects Lista de materias
     */
    public void showAllClasses(ArrayList<Subject> subjects) {

        System.out.println("\nAll classes: ");
        SubjectController.findClasses(subjects);

    }

    /**
     * @param subjects Lista de materias
     * @param choice Opción que ingresa el usuario
     */
    public void showInfoClass(ArrayList<Subject> subjects, int choice) {

        System.out.println("Information class");

        SubjectController.infoClass(subjects, choice);

    }

}
