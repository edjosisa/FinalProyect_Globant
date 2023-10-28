package app.org.globant.model;

public class TeacherPartTime extends Person implements Teacher {

    // variables
    private int activeHours;

    /**
     * 
     * @param name        Nombre del profesor
     * @param activeHours Hora que trabaja el profesor
     */

    public TeacherPartTime(String name, int activeHours) {
        super(name);
        this.activeHours = activeHours;
    }

    // getters y setters

    public int getActiveHours() {
        return activeHours;
    }

    public void setActiveHours(int activeHours) {
        this.activeHours = activeHours;
    }

    /**
     * 
     * @return El método devuelve el salario calculado del producto del salario base
     *         con las horas activas.
     */
    public double calculatedSalary() {

        return SALARY_PART_TIME * this.activeHours;

    }

}
