import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Number 2: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}
