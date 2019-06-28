import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

        int width;
        int length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Width of the square: ");
        width = sc.nextInt();

        System.out.println("Length of the square: ");
        length = sc.nextInt();

        for (int j = 0; j < length; j++) {
            for (int i = 0; i < width; i++) {
                if(i == 0 || j == 0) {
                    System.out.print("%");
                } else if(i != width && j == length-1) {
                    System.out.print("%");
                } else if(j != length && i == width-1) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }
}

