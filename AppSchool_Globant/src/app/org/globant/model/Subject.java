
package app.org.globant.model;

import java.util.ArrayList;

public class Subject {

    // variables
    private String name;
    private String classroom;
    // Estas son variables de instancia de la clase `Subject`.
    private ArrayList<Student> sList;
    private TeacherFullTime teacherFullTime;
    private TeacherPartTime teacherPartTime;

    /**
     * 
     * @param name      Nombre de la clase
     * @param classroom Salon de clase
     */

    // Método constructor para la clase de la materia e inicialización de la lista.
    public Subject(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
        sList = new ArrayList<>();
    }

    // Métodos getter y setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Student> getsList() {
        return sList;
    }

    public void setsList(ArrayList<Student> sList) {
        this.sList = sList;
    }

    public TeacherFullTime getTeacherFullTime() {
        return teacherFullTime;
    }

    public void setTeacherFullTime(TeacherFullTime teacherFullTime) {
        this.teacherFullTime = teacherFullTime;
    }

    public TeacherPartTime getTeacherPartTime() {
        return teacherPartTime;
    }

    public void setTeacherPartTime(TeacherPartTime teacherPartTime) {
        this.teacherPartTime = teacherPartTime;
    }

    /**
     * La función addStudent agrega un estudiante a una lista de estudiantes.
     *
     * @param student parametro de tipo Student, representa la instancia
     *                que se quiere guardar a la lista.
     */

    public void addStudent(Student student) {
        sList.add(student);
    }

}