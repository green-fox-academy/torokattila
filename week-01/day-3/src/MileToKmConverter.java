import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        System.out.println("Please enter a decimal distance in miles: ");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        System.out.println("This is: " + (input * 1.609344) + "km");
    }
}
