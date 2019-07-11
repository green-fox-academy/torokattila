package Farm;

public class FarmMain {

    public static void main(String[] args) {

        Farm farm = new Farm(20);

        farm.addAnimal(new Animal("Cow", 20));
        farm.addAnimal(new Animal("Cat", 30));
        farm.addAnimal(new Animal("Horse", 50));
        farm.addAnimal(new Animal("Goat", 10));

        farm.breed(new Animal("Dog", 100));
        System.out.println("Number of animals before slaughter: " + farm.farmAnimals.size());
        farm.slaughter();
        System.out.println("Number of animals after slaughter: " + farm.farmAnimals.size());


    }

}
