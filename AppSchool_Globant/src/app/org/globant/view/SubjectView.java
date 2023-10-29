package app.org.globant.view;

import java.util.ArrayList;

import app.org.globant.controller.SubjectController;
import app.org.globant.model.Subject;

public class SubjectView {

    public void showAllClasses(ArrayList<Subject> subjects) {

        System.out.println("\nAll classes: ");
        SubjectController.findClasses(subjects);

    }

    public void showInfoClass(ArrayList<Subject> subjects, int choice) {

        System.out.println("Information class");

        SubjectController.infoClass(subjects, choice);

    }

}
