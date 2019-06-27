import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        System.out.println("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0) {
            System.out.println("Your number is an even number");
        } else {
            System.out.println("Your number is an odd number");
        }

    }
}
