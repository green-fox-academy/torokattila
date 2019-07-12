public class SumDigit {

    public static void main(String[] args) {
        int sum = sumOfDigitsRecursively(123);
        System.out.println(sum);
    }

    private static int sumOfDigitsRecursively(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumOfDigitsRecursively(n / 10);
        }
    }

}
