package main.java.flyable;

public class Helicopter extends Vehicle implements Flyable{

    public Helicopter(String name, String color, int doors) {
        super.name = name;
        super.color = color;
        super.doors = doors;
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {

    }
}
