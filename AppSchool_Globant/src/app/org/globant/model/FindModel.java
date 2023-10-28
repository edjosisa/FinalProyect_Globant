package app.org.globant.model;

import java.util.ArrayList;

public interface FindModel {

    /**
     * El método busca un estudiante en una lista de estudiantes por su ID y
     * devuelve el objeto de estudiante.
     * 
     * @param id Identificador único de un estudiante.
     * @return devuelve un objeto Estudiante y en caso de que no se
     *         encuentre un estudiante devuelve un null.
     */
    Student findStudentById(int id);

    /**
     * La función busca las clases en las que está matriculado un estudiante con un
     * determinado ID.
     *
     * @param id Identificador único de un estudiante.
     * @return El método devuelve una ArrayList de objetos Subject de las clases que
     *         esta inscrito el estudiante.
     */
    ArrayList<Subject> findClassByStudent(int id);
}
