package app.org.globant.model;

/**
 * The TeacherPartTime class is a subclass of the Person class.
 */
public class TeacherPartTime extends Person {

    // variables
    private double salary;
    private int activeHours;

    /**
     * 
     * @param name        nombre del profesor part time
     * @param id          identificador
     * @param salary      salario base
     * @param activeHours Horas de actividad por semana
     */

    // The code snippet is defining a constructor for the `TeacherPartTime` class.
    public TeacherPartTime(String name, int id, double salary, int activeHours) {
        super(name, id);
        this.salary = salary;
        this.activeHours = activeHours;
    }

    // etters y setters para obtener y enviar datos al profesor part time

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(int activeHours) {
        this.activeHours = activeHours;
    }

    /**
     * Este método calcula el salario para los profesores part time
     * 
     * @return El método devuelve el salario calculado,
     *         que es el producto del salario base con las horas activas.
     */
    public double calculatedSalary() {

        return this.salary * this.activeHours;

    }

}
