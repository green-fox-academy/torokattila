package TheGardenApplication;

public class Main {

    public static void main(String[] args) {
        Garden garden = new Garden();

        Flower flower = new Flower("yellow", 0);
        garden.add(flower);
        Flower flower2 = new Flower("blue", 0);
        garden.add(flower2);
        Tree tree = new Tree("purple", 0);
        garden.add(tree);
        Tree tree2 = new Tree("orange", 0);
        garden.add(tree2);


    }

}
