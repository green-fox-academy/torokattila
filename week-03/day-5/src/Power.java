public class Power {

    public static void main(String[] args) {
        int base = 3, power = 2;
        int result = recursivePower(base, power);
        System.out.println(base + "^" + power + " = " + result);
    }

    public static int recursivePower(int base, int power) {
        if (power != 0) {
            return base * (recursivePower(base, power - 1));
        } else {
            return 1;
        }
    }
}
