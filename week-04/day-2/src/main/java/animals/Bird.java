package main.java.animals;

public class Bird extends Animal {

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void speak() {

    }

    @Override
    public void move() {

    }
}
