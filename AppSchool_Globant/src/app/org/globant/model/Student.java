package app.org.globant.model;

public class Student extends Person {

    // variable
    private int age;

    /**
     * Constructor para la clase Estudiante.
     * 
     * @param name nombre del estudiante
     * @param id   identificador del estudiante
     * @param age  edad del estudiante
     */

    public Student(String name, int id, int age) {
        super(name, id);
        this.age = age;
    }

    // getters y setters para obtener y enviar datos a la clase estudiante
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
