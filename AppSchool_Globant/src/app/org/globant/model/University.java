package app.org.globant.model;

import java.util.ArrayList;

public class University {

    private ArrayList<Student> sList;
    private ArrayList<Subject> suList;
    private ArrayList<TeacherFullTime> tfList;
    private ArrayList<TeacherPartTime> tpList;

    public University() {
        sList = new ArrayList<>();
        suList = new ArrayList<>();
        tfList = new ArrayList<>();
        tpList = new ArrayList<>();
    }

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
