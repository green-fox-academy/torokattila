import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int number = 150;
        Scanner sc = new Scanner(System.in);
        int guess;

        do {
            System.out.print("Guess the number what i was thinking: ");
            guess = sc.nextInt();
            if(guess == number) {
                System.out.println("Your guess is correct!");
            } else if(guess > number) {
                System.out.println("The number is lower, try again!");
            } else if(guess < number) {
                System.out.println("The number is higher, try again!");
            }
        } while(guess != number);


    }
}
