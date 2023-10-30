package app.org.globant.view;

public class UniversityView {
    private StudentView studentView;
    private SubjectView subjectView;
    private TeacherFullTimeView teacherFullTimeView;
    private TeacherPartTimeView teacherPartTimeView;

    private static UniversityView instance = null;

    private UniversityView() {
        studentView = new StudentView();
        subjectView = new SubjectView();
        teacherFullTimeView = new TeacherFullTimeView();
        teacherPartTimeView = new TeacherPartTimeView();
    }

    public static UniversityView getInstance() {
        if (instance == null) {
            instance = new UniversityView();
        }
        return instance;
    }

    // Getters
    public StudentView getStudentView() {
        return studentView;
    }

    public SubjectView getSubjectView() {
        return subjectView;
    }

    public TeacherFullTimeView getTeacherFullTimeView() {
        return teacherFullTimeView;
    }

    public TeacherPartTimeView getTeacherPartTimeView() {
        return teacherPartTimeView;
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

    // método para el sub-menú
    public void showSubMenu() {
        System.out.println("Choice a class:");

    }

}
