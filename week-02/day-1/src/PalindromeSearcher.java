import java.util.ArrayList;

public class PalindromeSearcher {

    public static void main(String[] args) {

        System.out.println(searchPalindrome("racecar"));
    }

    public static ArrayList<String> searchPalindrome(String pal) {
        char[] letters = pal.toCharArray();
        ArrayList<String> newWords = new ArrayList<>();
        String newWord = "";
        for(int i = 0; i < letters.length - 2; i++) {
            if(letters[i] == letters[i + 2]) {
                for(int j = 0; j < 3; j++) {
                    newWord += letters[i + j];
                }
                newWords.add(newWord);
                newWord = "";
                if(i > 0 && i < letters.length - 3 && letters[i - 1] == letters[i + 3]) {
                    for(int k = 0; k < 5; k++) {
                        newWord += letters[i - 1 + k];
                    }
                    newWords.add(newWord);
                    newWord = "";
                }
            }
        }
        return newWords;
    }

}
