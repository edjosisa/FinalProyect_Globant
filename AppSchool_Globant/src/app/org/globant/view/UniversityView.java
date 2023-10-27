package app.org.globant.view;

import java.util.ArrayList;
import java.util.Scanner;

//Importacion de los paquetes donde se encuentra los modelos
import app.org.globant.model.Student;
import app.org.globant.model.Subject;
import app.org.globant.model.TeacherFullTime;
import app.org.globant.model.TeacherPartTime;

public class UniversityView {

    private Scanner sc;

    public UniversityView() {
        sc = new Scanner(System.in);
    }

    // Método para mostrar el menú de la app
    public void showMenu() {

        System.out.println("\nUniversity classes tracking system");
        System.out.println("1. Print all professors");
        System.out.println("2. Print all classes");
        System.out.println("3. Create a new student");
        System.out.println("4. Create a new class");
        System.out.println("5. List all classes for a given student");
        System.out.println("6. Exit");
        System.out.println("Enter your choice:");
    }

    // método para el submenú
    public void showSubMenu() {
        System.out.println("Choice a class:");

    }

    /**
     * La función getInput() lee una entrada entera del usuario y la devuelve.
     *
     * @return El método devuelve un valor entero.
     */
    public int getInput() {
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;

    }

    /**
     * La función imprime los nombres y salarios de todos los profesores de tiempo
     * completo y parcial.
     *
     * @param teacherFullTimes Un ArrayList de objetos de tipo TeacherFullTime, que
     *                         representa
     *                         profesores de tiempo completo.
     * @param teacherPartTimes Una ArrayList de objetos TeacherPartTime, que
     *                         representa una lista de
     *                         profesores a tiempo parcial.
     */
    public void printAllProfessors(ArrayList<TeacherFullTime> teacherFullTimes,
            ArrayList<TeacherPartTime> teacherPartTimes) {

        System.out.println("\nTeacher full time: ");
        // Reiniciar el contador a 0 cuando vaya a imprimir los profesores part time
        int count = 0;
        for (TeacherFullTime teacherFullTime : teacherFullTimes) {
            String salary = String.format("%.2f", teacherFullTime.calculatedSalary());
            count++;
            System.out.println(
                    count + ". Name: " + teacherFullTime.getName() + " Salary: $" + salary);
        }
        count = 0;
        System.out.println("\nTeacher part time: ");
        for (TeacherPartTime teacherPartTime : teacherPartTimes) {
            String salary = String.format("%.2f", teacherPartTime.calculatedSalary());
            count++;
            System.out.println(
                    count + ". Name: " + teacherPartTime.getName() + " Salary: $" + salary);
        }

    }

    /**
     * La función imprime el nombre y el salón de clases de todas las materias en un
     * ArrayList.
     *
     * @param subjects Una ArrayList de objetos Subject.
     */
    public void printAllClasses(ArrayList<Subject> subjects) {
        int count = 0;
        System.out.println("\nAll classes: ");

        for (Subject subject : subjects) {
            count++;
            System.out.println(count + ". " + subject.getName());
        }
    }

    /**
     * La función imprime información sobre una lista de temas, incluido su nombre,
     * aula,
     * profesor, y listado de alumnos.
     *
     * @param subjects Una ArrayList de objetos SUbject.
     */
    // falta implementar el submenú para mostrar el profesor de la materia y los
    // estudiantes.
    public static void printInfoClass(ArrayList<Subject> subjects, int choice) {

        System.out.println("Information class");
        System.out.println("Classroom: " + subjects.get(choice - 1).getClassroom());
        if (subjects.get(choice - 1).getTeacherFullTime() != null) {

            System.out.println("Teacher: " + subjects.get(choice - 1).getTeacherFullTime().getName());
        } else {
            System.out.println("Teacher: " + subjects.get(choice - 1).getTeacherPartTime().getName());
        }
        System.out.println("Students:");
        int count = 0;
        for (Student student : subjects.get(choice - 1).getsList()) {
            count++;
            System.out.println(count + ". " + student.getName());
        }
    }

    /**
     * La función crea un nuevo objeto Estudiante ingresando la identificación, el
     * nombre y la edad del estudiante.
     *
     * @return El método devuelve una nueva instancia de la clase Estudiante con el
     *         estudiante proporcionado.
     * 
     */
    // falta colocar un sc.nextLine() para consumir el caracter de la nueva línea.
    public Student createStudent() {
        System.out.println("Enter student Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();

        return new Student(name, id, age);
    }

    /**
     * La función permite al usuario elegir un profesor de una lista de profesores
     * de tiempo completo y parcial.
     * y asignarlos a una clase.
     *
     * @param teacherFullTimes Un ArrayList de objetos de tipo TeacherFullTime, que
     *                         representa una lista
     *                         de docentes de tiempo completo.
     * @param teacherPartTimes Una ArrayList de objetos TeacherPartTime, que
     *                         representa una lista de
     *                         profesores a tiempo parcial.
     * @param sujeto           El objeto sujeto representa una materia a la que se
     *                         le debe asignar un maestro.
     */
    private void choiceTeacher(ArrayList<TeacherFullTime> teacherFullTimes, ArrayList<TeacherPartTime> teacherPartTimes,
            Subject subject) {
        int count = 0;
        System.out.println("Existing teacher");
        System.out.println("\nTeacher Full Time");
        for (TeacherFullTime teacherFullTime : teacherFullTimes) {
            count++;
            System.out.println(count + ". " + teacherFullTime.getName());
        }
        count = 0;
        System.out.println("\nTeacher Part Time");
        for (TeacherPartTime teacherPartTime : teacherPartTimes) {
            count++;
            System.out.println(count + ". " + teacherPartTime.getName());
        }
        System.out.println("Choice type teacher(full time or part time): ");
        String typeTeacher = sc.nextLine().toLowerCase().replace(" ", "");
        System.out.println("Choice the number:");
        int choiceTeacher = sc.nextInt();
        sc.nextLine();
        if (typeTeacher.equals("parttime")) {
            TeacherPartTime teacherPartTime = teacherPartTimes.get(choiceTeacher - 1);
            subject.setTeacherPartTime(teacherPartTime);
        } else if (typeTeacher.equals("fulltime")) {
            TeacherFullTime teacherFullTime = teacherFullTimes.get(choiceTeacher - 1);
            subject.setTeacherFullTime(teacherFullTime);
        } else {
            System.out.println("Type invalid!");
        }
    }

    /**
     * La función permite al usuario elegir estudiantes de una lista y agregarlos a
     * una clase.
     *
     * @param students Una ArrayList de objetos Student, que representa una
     *                 lista de students existentes.
     * @param subject  El parámetro subject es una instancia de la clase Subject.
     */
    private void choiceStudents(ArrayList<Student> students, Subject subject) {
        int count = 0;
        boolean condition = false;
        System.out.println("Existing Student");
        for (Student student : students) {
            count++;
            System.out.println(count + ". " + student.getName());
        }

        do {
            System.out.println("Choice the Student");
            int choice = sc.nextInt();
            sc.nextLine();
            Student student = students.get(choice - 1);
            subject.addStudent(student);
            System.out.println("Do you want to add other student?(Y/n)");
            String option = sc.nextLine().toLowerCase().replace("yes", "y").replace("no", "n");

            if (option.equals("y")) {
                condition = false;
            } else {
                condition = true;
            }

        } while (!condition);
    }

    /**
     * Esta función crea un nuevo objeto de clase tomando entradas para el nombre de
     * la clase, el aula y
     * seleccionar un profesore y estudiantes para la clase.
     *
     * @param teacherFullTimes Una ArrayList de objetos de tipo TeacherFullTime.
     *                         Esta lista contiene
     *                         profesores de tiempo completo que pueden ser
     *                         asignados a la nueva clase.
     * @param teacherPartTimes Un ArrayList de objetos TeacherPartTime, que
     *                         representa la lista de
     *                         Profesores a tiempo parcial disponibles para la
     *                         clase.
     * @param Students         Una ArrayList de objetos Student, que representa la
     *                         lista de estudiantes disponibles para
     *                         la clase.
     * @return El método devuelve una instancia de la clase Subject.
     */
    public Subject createClass(ArrayList<TeacherFullTime> teacherFullTimes, ArrayList<TeacherPartTime> teacherPartTimes,
            ArrayList<Student> students) {

        System.out.println("Enter class name: ");
        String name = sc.nextLine();
        System.out.println("Enter classroom: ");
        String classroom = sc.nextLine();
        Subject newClass = new Subject(name, classroom);
        choiceTeacher(teacherFullTimes, teacherPartTimes, newClass);
        choiceStudents(students, newClass);
        return newClass;
    }

    /**
     * La función solicita al usuario que ingrese una identificación de estudiante y
     * devuelve la identificación ingresada como un número entero.
     *
     * @return El método devuelve un valor entero, que es el ID del estudiante
     *         ingresado por el usuario.
     */
    public int StudentId() {
        System.out.println("Enter Student Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        return id;
    }

    /**
     * La función "showClassesByStudent" toma una ArrayList de objetos Subject e
     * imprime el
     * nombre y aula de cada materia.
     *
     * @param subjects Una ArrayList de objetos Subject.
     */
    public void showClassesByStudent(ArrayList<Subject> subjects, Student student) {
        int count = 0;
        System.out.println("Student " + student.getName());
        for (Subject subject : subjects) {
            count++;
            System.out.println(count + ". Class name: " + subject.getName() + " Classroom: " + subject.getClassroom());
        }
    }

}
