public class Sum {

    public static void main(String[] args) {
        System.out.println(sum(4, 5, 9));
    }

    public static int sum(int... numbers) {
        int result = 0;
        for(int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }
}
