import java.util.HashMap;

public class MapIntroduction2 {

    public static void main(String[] args) {

        HashMap<String, String> newHashMap = new HashMap<>();
        newHashMap.put("978-1-60309-452-8", "A Letter to Jo");
        newHashMap.put("978-1-60309-459-7", "Lupus");
        newHashMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        newHashMap.put("978-1-60309-461-0", "The Lab");

        for(String n : newHashMap.keySet()) {
            System.out.println(newHashMap.get(n) + " (ISBN: " + n + ")");
        }

        newHashMap.remove("978-1-60309-444-3");
        System.out.println(newHashMap);

        newHashMap.values().remove("The Lab");
        System.out.println(newHashMap);

        newHashMap.put("978-1-60309-450-4", "They Called Us Enemy");
        newHashMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

        if(newHashMap.containsKey("478-0-61159-424-8")) {
            System.out.println("Yes, this is an existing key");
        } else {
            System.out.println("There's no value with this key");
        }

        System.out.println(newHashMap.get("978-1-60309-453-5"));
    }
}
