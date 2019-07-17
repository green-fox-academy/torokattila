package main.java.animals;

public abstract class Animal {

    String name;
    int age;
    String gender;
    int legs;
    int ears;

    public abstract String getName();

    public abstract String breed();

    public abstract void speak();

    public abstract void move();
}
