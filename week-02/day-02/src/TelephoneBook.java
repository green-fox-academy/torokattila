import java.util.HashMap;

public class TelephoneBook {

    public static void main(String[] args) {
        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("William A. Lathan", "405-709-1865");
        phoneBook.put("John K. Miller", "402-247-8568");
        phoneBook.put("Hortensia E. Foster", "606-481-6467");
        phoneBook.put("Amanda D. Newland", "319-243-5613");
        phoneBook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(phoneNumber(phoneBook, "John K. Miller"));
        System.out.println(whoIs(phoneBook, "307-687-2982"));
        doWeKnow(phoneBook, "Chris E. Myers'");

    }

    public static String phoneNumber(HashMap<String, String> input, String name) {
        String a = "";
        a = input.get(name);
        return a;
    }

    public static String whoIs(HashMap<String, String> input, String number) {
        String a = "";
        for(String b : input.keySet()) {
            if(number == input.get(b)) {
                a = b;
            }
        }
        return a;
    }

    public static void doWeKnow(HashMap<String, String> input, String name) {
        boolean a = false;
        if(input.containsKey(name) == a) {
            System.out.println("You don't have this number");
        }
    }
}
