import java.util.ArrayList;

public class ShoppingList {

    public static void main(String[] args) {
        ArrayList<String> shopping = new ArrayList<>();

        shopping.add("Eggs");
        shopping.add("Milk");
        shopping.add("Fish");
        shopping.add("Apples");
        shopping.add("Bread");
        shopping.add("Chicken");

        doWeHaveMilk(shopping, "Milk");
        doWeHaveMilk(shopping, "Banana");
    }

    public static void doWeHaveMilk(ArrayList<String> input, String item) {
        boolean a = false;
        if(input.contains(item) != a) {
            System.out.println("You have this item on your list");
        } else {
            System.out.println("You don't have this item on your list");
        }
    }
}
