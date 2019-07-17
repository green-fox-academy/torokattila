package CountLetters;

import java.util.HashMap;

public class CountLetters {

    public HashMap<Character, Integer> characterCount(String inputString) {

        if (inputString == null) {
            return null;
        } else if (inputString.equals("")) {
            return null;
        }

        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] strArray = inputString.toCharArray();

        for(char c : strArray) {
            if(charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
//        for (Map.Entry entry : charCountMap.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        return charCountMap;
    }

}
