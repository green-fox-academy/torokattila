public class CompareLength {

    public static void main(String[] args) {

        int[] p = {1, 2, 3};
        int[] p2 = {4, 5};

        if(p2.length > p.length) {
            System.out.println("p2 is longer");
        } else {
            System.out.println("p longer than p2");
        }
    }
}
