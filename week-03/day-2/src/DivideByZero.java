import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        System.out.println("Give me a number: ");
        Scanner sc = new Scanner(System.in);
        int divisor = sc.nextInt();

        divider(divisor);

    }

    public static void divider(int a) {

        try {
            int result = 10 / a;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.err.println("Fail");
        }
    }
}
