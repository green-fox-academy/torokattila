package EncapsulationAndContructor;

public class Main {

    public static void main(String[] args) {

        //Animal
        Animal animal = new Animal();
        animal.eat();
        System.out.println(animal.hunger);
        animal.drink();
        System.out.println(animal.thirst);
        animal.play();
        System.out.println(animal.hunger + " " + animal.thirst);

        System.out.println();

        //Sharpie
        Sharpie sharpie = new Sharpie();
        sharpie.color = "red";
        sharpie.width = 12.3;
        sharpie.use();
        System.out.println(sharpie.inkAmount);

        System.out.println();

        //Counter
        Counter c = new Counter();
        c.add(7);
        System.out.println(c.get());
        c.reset();
        System.out.println(c.get());
    }

}
