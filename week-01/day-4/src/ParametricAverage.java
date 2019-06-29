import java.util.Scanner;

public class ParametricAverage {

    public static void main(String[] args) {
        System.out.print("Enter integer numbers: ");
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        int count = 0;
        double average;
        do {
            num = sc.nextInt();
            sum += num;
            average = (double)sum / count;
            count++;
        } while(num != 0);
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + average);
    }
}
