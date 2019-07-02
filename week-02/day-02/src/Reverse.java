public class Reverse {

    public static void main(String[] args) {

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        System.out.println("Before: " + reversed);
        System.out.println("After: " + reverseString(reversed));

    }

    public static String reverseString(String input) {

        String rev = "";
        for(int i = input.length() - 1; i >= 0; i--) {
            rev += input.charAt(i);
        }
        return rev;

    }
}
