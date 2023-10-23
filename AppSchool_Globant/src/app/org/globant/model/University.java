package app.org.globant.model;

import java.util.ArrayList;

public class University {

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

    /**
     * La función busca un estudiante en una lista de estudiantes por su ID y
     * devuelve el objeto de estudiante.
     *
     * @param id El parámetro "id" es un número entero que representa el
     *           identificador único de un estudiante.
     * @return El método devuelve un objeto Estudiante y en cado de que no se
     *         encuentre devuelve un null.
     */
    public Student findStudentById(int id) {

        for (Student student : sList) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    /**
     * La función busca las clases en las que está matriculado un estudiante con un
     * determinado ID.
     *
     * @param id El parámetro "id" es un número entero que representa el
     *           identificador único de un estudiante.
     * @return El método devuelve una ArrayList de objetos Subject.
     */
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
