public class Bunnies {

    public static void main(String[] args) {
        int bunnies = 12;
        int totalEars = recursiveEars(bunnies);
        System.out.println("The total ears: " + totalEars);
    }

    private static int recursiveEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + (recursiveEars(bunnies - 1));
        }
    }
}
