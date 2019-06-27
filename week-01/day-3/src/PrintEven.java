public class PrintEven {

    public static void main(String[] args) {

        int even = 500;
        System.out.println("Printing even numbers between 0 and: " + even);
        for (int i = 0; i < even; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
