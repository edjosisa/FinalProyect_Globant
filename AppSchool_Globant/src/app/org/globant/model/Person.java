package app.org.globant.model;

/**
 * La clase Person representa una persona que en este caso puede ser un
 * estudiante o profesor.
 */
public class Person {

    // Variables heredadas por los hijos Student y Teacher part time y full time.
    protected String name;
    protected int id;

    /**
     * 
     * @param name nombre para el estudiante o profesor
     * @param id   identificador para el estudiante o profesor
     */

    // constructor de la clase `Persona`.
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // getters y setters para obtener y enviar datos a la clase padre Person.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
