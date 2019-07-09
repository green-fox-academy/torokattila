import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {

        System.out.println("Give me a number: ");
        Scanner sc = new Scanner(System.in);
        int divide = sc.nextInt();

        divider(divide);

    }

    public static void divider(int a) {

        try {
            int result = 10 / a;
            System.out.println(result);
        } catch (ArithmeticException ex) {
            System.err.println("Fail!");
        }
    }
}
