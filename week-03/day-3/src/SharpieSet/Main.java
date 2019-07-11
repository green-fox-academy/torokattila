package SharpieSet;

public class Main {

    public static void main(String[] args) {
        SharpieSet sharpieSet = new SharpieSet();

        sharpieSet.addSharpie(new Sharpie("blue", 12.3f, 30));
        sharpieSet.addSharpie(new Sharpie("red", 4.54f, 0));
        sharpieSet.addSharpie(new Sharpie("yellow", 10.3f, 0));
        sharpieSet.addSharpie(new Sharpie("orange", 6.92f, 0));
        sharpieSet.addSharpie(new Sharpie("black", 4.24f, 0));

        System.out.println(sharpieSet.countUsable());
        System.out.println(sharpieSet.removeTrash());

    }

}
