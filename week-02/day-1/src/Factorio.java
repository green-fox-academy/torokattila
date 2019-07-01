public class Factorio {

    public static void main(String[] args) {
        System.out.println(factorio(5));
    }

    public static int factorio(int number) {
        int result = 1;
        for(int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
