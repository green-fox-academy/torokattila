package TeachersAndStudents;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Karoly");

        Teacher teacher = new Teacher();

        student.question(teacher);
        teacher.teach(student);
    }

}
