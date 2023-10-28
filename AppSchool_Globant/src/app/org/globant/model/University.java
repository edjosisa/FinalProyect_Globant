package app.org.globant.model;

import java.util.ArrayList;

public class University implements FindModel {

    // variables de instancia privadas en la clase "Universidad".

    private ArrayList<Student> sList;
    private ArrayList<Subject> suList;
    private ArrayList<TeacherFullTime> tfList;
    private ArrayList<TeacherPartTime> tpList;

    // Constructor para inicializar las listas
    public University() {
        sList = new ArrayList<>();
        suList = new ArrayList<>();
        tfList = new ArrayList<>();
        tpList = new ArrayList<>();
    }

    // Métodos getters y setters de la clase University.
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

    public Student findStudentById(int id) {

        for (Student student : sList) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    public ArrayList<Subject> findClassByStudent(int id) {
        ArrayList<Subject> classByStudent = new ArrayList<>();
        Student student = findStudentById(id);

        if (student != null) {
            for (Subject subject : suList) {
                if (subject.getsList().contains(student)) {
                    classByStudent.add(subject);
                }
            }
        }
        return classByStudent;

    }

}
