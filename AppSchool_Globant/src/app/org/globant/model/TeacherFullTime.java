package app.org.globant.model;

public class TeacherFullTime extends Person {

    // variables
    private double salary;
    private int experienceYears;

    /**
     * 
     * @param name            nombre del profesor full time
     * @param id              identificador del profesor
     * @param salary          salario base
     * @param experienceYears experiencia en años
     */

    // El fragmento de código define un constructor para la clase `TeacherFullTime`.
    public TeacherFullTime(String name, int id, double salary, int experienceYears) {
        super(name, id);
        this.salary = salary;
        this.experienceYears = experienceYears;
    }

    // getters y setters para obtener y enviar datos al profesor full time
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    /**
     * Este método calcula el salario para los profesores full time.
     * 
     * @return El método devuelve el salario calculado,
     *         que es el producto del salario base con el 110% de sus *años de
     *         experiencia.
     */
    public double calculatedSalary() {

        return this.salary * 1.1 * this.experienceYears;

    }

}
