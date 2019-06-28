import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of chickens: ");
        int chicken = sc.nextInt();

        System.out.print("Number of pigs: ");
        int pig = sc.nextInt();

        System.out.println("The total of the legs: " + ((chicken * 2) + (pig * 4)));
    }
}
