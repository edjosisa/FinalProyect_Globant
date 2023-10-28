package app.org.globant.model;

public class TeacherFullTime extends Person implements Teacher {

    private int experienceYears;

    /**
     * @param name            Nombre del profesor
     * @param experienceYears Años de experiencia
     */

    public TeacherFullTime(String name, int experienceYears) {
        super(name);
        this.experienceYears = experienceYears;
    }

    // getters y setters

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    /**
     * 
     * @return El método devuelve el salario calculado por el producto del salario
     *         base con el 110% de sus *años de
     *         experiencia.
     */
    public double calculatedSalary() {

        return SALARY_FULL_TIME * 1.1 * this.experienceYears;

    }

}
