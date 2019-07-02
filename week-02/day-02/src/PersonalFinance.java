
import java.util.ArrayList;

public class PersonalFinance {

    public static void main(String[] args) {
        ArrayList<Integer> finance = new ArrayList<>();

        finance.add(500);
        finance.add(1000);
        finance.add(1250);
        finance.add(175);
        finance.add(800);
        finance.add(120);

        System.out.println(finance);

        System.out.println("Total spent: " + spending(finance));
        System.out.println("Greatest expense: " + greatest((finance)));
        System.out.println("Cheapest spending: " + cheapest(finance));
        System.out.println("Average amount of spendings: " + amount(finance));
    }

    public static int spending(ArrayList<Integer> input) {
        int sum = 0;
        for(int i = 0; i < input.size(); i++) {
            sum += input.get(i);
        }
        return sum;
    }

    public static int greatest(ArrayList<Integer> great) {
        int max = 0;
        for(int num : great) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int cheapest(ArrayList<Integer> cheap) {
        if(cheap.isEmpty()) {
            return 0;
        }
        int min = cheap.get(0);
        for(int num : cheap) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int amount(ArrayList<Integer> avg) {
        int sum = 0;
        sum = spending(avg) / avg.size();
        return sum;
    }
}
