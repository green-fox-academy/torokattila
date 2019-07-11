package TeachersAndStudents;

public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void learn() {
        System.out.println("The student " + name + " is learning something new");
    }


    public void question(Teacher teacher) {
        teacher.answer();
    }
}
