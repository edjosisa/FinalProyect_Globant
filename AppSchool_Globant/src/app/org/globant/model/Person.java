package app.org.globant.model;

public class Person {

    // Variables
    protected String name;
    protected int id;

    /**
     * @param name nombre para el estudiante o profesor
     * @param id   identificador para el estudiante o profesor
     */

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
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

}
