import java.util.Scanner;

public class AverageOfInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Number One: ");
        int num1 = sc.nextInt();

        System.out.println("Number Two: ");
        int num2 = sc.nextInt();

        System.out.println("Number Three: ");
        int num3 = sc.nextInt();

        System.out.println("Number four: ");
        int num4 = sc.nextInt();

        System.out.println("Number five: ");
        int num5 = sc.nextInt();

        int sum = num1 + num2 + num3 + num4 + num5;
        System.out.println("The sum of the numbers is: " + sum);
        double average = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("The average is: " + average);


    }
}
