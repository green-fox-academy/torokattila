package Cloneable;


public class Main {

    public static void main(String[] args) {

        Student john = new Student("John", 20, "male", "BME");
        System.out.println(john.name + " " + john.age + " " + john.gender + " " + john.universtiy);

        Student johnTheClone = john.clone();
        System.out.println(johnTheClone.name + " " + johnTheClone.age + " " + johnTheClone.gender + " " + johnTheClone.universtiy);

    }
}
