import java.util.HashMap;

public class MapIntroduction1 {

    public static void main(String[] args) {
        HashMap<Integer, Character> newHashMap = new HashMap<>();

        System.out.println(newHashMap.isEmpty());

        newHashMap.put(97, 'a');
        newHashMap.put(98, 'b');
        newHashMap.put(99, 'c');
        newHashMap.put(65, 'A');
        newHashMap.put(66, 'B');
        newHashMap.put(67, 'C');

        System.out.println(newHashMap.keySet());

        System.out.println(newHashMap.values());

        System.out.println(newHashMap.size());

        newHashMap.remove(97);

        System.out.println(newHashMap);

        System.out.println(newHashMap.containsKey(100));

        newHashMap.clear();

        System.out.println(newHashMap.size());
    }
}
