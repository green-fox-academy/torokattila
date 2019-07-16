package Cloneable;

public class Student implements Cloneable {

    String name;
    int age;
    String gender;
    String universtiy;

    public Student() {}

    public Student(String name, int age, String gender, String universtiy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.universtiy = universtiy;
    }


    @Override
    public Student clone() {
        Student cloneStudent = new Student();
        cloneStudent.name = this.name;
        cloneStudent.age = this.age;
        cloneStudent.gender = this.gender;
        cloneStudent.universtiy = this.universtiy;
        return cloneStudent;
    }
}
