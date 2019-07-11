import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        System.out.println(anagram("dog", "god"));

    }

    public static boolean anagram(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equalsIgnoreCase(sc2);
    }
}
