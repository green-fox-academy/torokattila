public class PalindromeBuilder {

    public static void main(String[] args) {

        System.out.println(palindrome("lol"));
    }

    public static String palindrome(String pal) {
        String original = pal;
        String reverse = "";
        for(int i = pal.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        return original + reverse;
    }
}
