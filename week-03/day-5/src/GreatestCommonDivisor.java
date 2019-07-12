public class GreatestCommonDivisor {

    public static void main(String[] args) {
        int number = 60, anotherNumber = 12;
        int result = recursiveCommonDivisor(number, anotherNumber);
        System.out.println("The common divisor of " + number + " and " + anotherNumber + " is: " + result);
    }

    private static int recursiveCommonDivisor(int number, int anotherNumber) {
        if(anotherNumber != 0) {
            return recursiveCommonDivisor(anotherNumber, number % anotherNumber);
        } else {
            return number;
        }
    }

}
