package app.org.globant.model;

/**
 * @author Edwin Sisalema
 */

/**
 * La clase Estudiante es una subclase de la clase Persona.
 */
public class Student extends Person {

    // variable
    private int age;

    /**
     * 
     * @param name nombre del estudiante
     * @param id   identificador del estudiante
     * @param age  edad del estudiante
     */

    // un constructor para la clase Estudiante.
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
