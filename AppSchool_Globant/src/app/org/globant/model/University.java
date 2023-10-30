package app.org.globant.model;

import java.util.ArrayList;

public class University {

    private static University instance = null;
    // variables de instancia privadas en la clase "Universidad".

    private final ArrayList<Student> sList;
    private final ArrayList<Subject> suList;
    private final ArrayList<TeacherFullTime> tfList;
    private final ArrayList<TeacherPartTime> tpList;

    // Constructor para inicializar las listas
    private University() {
        sList = new ArrayList<>();
        suList = new ArrayList<>();
        tfList = new ArrayList<>();
        tpList = new ArrayList<>();
    }

    public static University getInstance() {
        if (instance == null) {
            instance = new University();
        }
        return instance;
    }

    // Métodos getters
    public ArrayList<Student> getsList() {
        return sList;
    }

    public ArrayList<Subject> getSuList() {
        return suList;
    }

    public ArrayList<TeacherFullTime> getTfList() {
        return tfList;
    }

    public ArrayList<TeacherPartTime> getTpList() {
        return tpList;
    }

    // Métodos para añadir a las listas
    public void addStudent(Student student) {
        sList.add(student);
    }

    public void addSubject(Subject subject) {
        suList.add(subject);
    }

    public void addTeacherFT(TeacherFullTime teacherFullTime) {
        tfList.add(teacherFullTime);
    }

    public void addTeacherPT(TeacherPartTime teacherPartTime) {
        tpList.add(teacherPartTime);
    }

}
