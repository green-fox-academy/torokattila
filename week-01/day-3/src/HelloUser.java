import java.util.Scanner;

public class HelloUser {

    public static void main(String[] args) {

        System.out.println("Please enter a name: ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        System.out.println("Hello, " + user + '!');

    }
}
