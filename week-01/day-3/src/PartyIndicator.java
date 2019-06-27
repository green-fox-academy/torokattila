import java.util.Scanner;

public class PartyIndicator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int girls = sc.nextInt();
        int boys = sc.nextInt();
        if((girls == boys) && ((girls + boys) >= 20)) {
            System.out.println("The party is excellent!");
        } else if(((girls + boys) >= 20) && (girls > 0)) {
            System.out.println("Quite cool party!");
        } else if(((girls + boys) <= 20) && (girls > 0)) {
            System.out.println("Average party");
        } else {
            System.out.println("Sausage party");
        }
    }
}
