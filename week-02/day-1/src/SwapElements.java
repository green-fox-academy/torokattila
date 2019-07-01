public class SwapElements {

    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};

        String newAbc = abc[0];
        abc[0] = abc[2];
        abc[2] = newAbc;

        for(String n : abc) {
            System.out.println(n);
        }
    }
}
