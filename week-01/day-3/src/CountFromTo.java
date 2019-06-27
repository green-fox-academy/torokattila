import java.util.Scanner;

public class CountFromTo {

    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if(number2 <= number1) {
            System.out.println("The second number should be bigger");
        } else if(number2 > number1) {
            for(int i = number1; i < number2; i++) {
                System.out.println(i);
            }
        }
    }
}
