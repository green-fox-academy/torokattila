package Anagram;

import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String s1, String s2) {

        if(s1 == null && s2 == null ) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equalsIgnoreCase(sc2);
    }

}
