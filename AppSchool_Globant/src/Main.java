import app.org.globant.controller.UniversityController;
import app.org.globant.model.Person;
import app.org.globant.model.Student;
import app.org.globant.model.Subject;
import app.org.globant.model.TeacherFullTime;
import app.org.globant.model.TeacherPartTime;
import app.org.globant.model.University;
import app.org.globant.view.UniversityView;

public class Main {

    public static void main(String[] args) {
        University model = new University();
        UniversityView view = new UniversityView();
        UniversityController controller = new UniversityController(model, view);

        Person teacherFullTime = new TeacherFullTime("Ricardo", 3);
        Person teacherFullTime1 = new TeacherFullTime("Eduardo", 4);
        Person teacherPartTime = new TeacherPartTime("Domenica", 30);
        Person teacherPartTime1 = new TeacherPartTime("Talia", 25);

        Person student = new Student("Jose", 1, 18);
        Person student1 = new Student("Gabriela", 2, 18);
        Person student2 = new Student("Lusiana", 3, 17);
        Person student3 = new Student("Tomas", 4, 22);
        Person student4 = new Student("Karen", 5, 20);
        Person student5 = new Student("Alberto", 6, 19);

        Subject math = new Subject("Math", "A-203");
        Subject spanish = new Subject("Spanish", "A-205");
        Subject physics = new Subject("Physics", "B-201");
        Subject poo = new Subject("POO", "D-304");

        math.addStudent((Student) student);
        math.addStudent((Student) student1);
        math.addStudent((Student) student2);
        spanish.addStudent((Student) student3);
        spanish.addStudent((Student) student4);
        spanish.addStudent((Student) student5);
        physics.addStudent((Student) student1);
        physics.addStudent((Student) student3);
        physics.addStudent((Student) student5);
        poo.addStudent((Student) student);
        poo.addStudent((Student) student2);
        poo.addStudent((Student) student4);

        math.setTeacherFullTime((TeacherFullTime) teacherFullTime);
        spanish.setTeacherPartTime((TeacherPartTime) teacherPartTime);
        physics.setTeacherPartTime((TeacherPartTime) teacherPartTime1);
        poo.setTeacherFullTime((TeacherFullTime) teacherFullTime1);

        model.addSubject(math);
        model.addSubject(spanish);
        model.addSubject(physics);
        model.addSubject(poo);

        model.addStudent((Student) student);
        model.addStudent((Student) student1);
        model.addStudent((Student) student2);
        model.addStudent((Student) student3);
        model.addStudent((Student) student4);
        model.addStudent((Student) student5);

        model.addTeacherFT((TeacherFullTime) teacherFullTime);
        model.addTeacherFT((TeacherFullTime) teacherFullTime1);
        model.addTeacherPT((TeacherPartTime) teacherPartTime);
        model.addTeacherPT((TeacherPartTime) teacherPartTime1);

        controller.run();
    }
}
