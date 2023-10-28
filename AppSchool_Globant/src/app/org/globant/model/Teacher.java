package app.org.globant.model;

public interface Teacher {

    double SALARY_FULL_TIME = 800.00;
    double SALARY_PART_TIME = 15.00;

    /**
     * Este método calcula el salario del profesor
     */
    double calculatedSalary();

}