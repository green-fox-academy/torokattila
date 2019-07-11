package TeachersAndStudents;

public class Teacher {

    public void answer() {
        System.out.println("Teacher is answering a question");
    }

    public void teach(Student student) {
        student.learn();
    }
}
