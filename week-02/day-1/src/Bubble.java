import java.util.ArrayList;
import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {

        System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
    }

    public static ArrayList<Integer> bubble(int[] num) {
        Arrays.sort(num);
        ArrayList<Integer> numberList = new ArrayList<>();
        for(int i = 0; i < num.length; i++) {
            numberList.add(num[i]);
        }
        return numberList;
    }

    public static ArrayList<Integer> advancedBubble(int[] list, boolean isTrue) {
        if(isTrue) {
            Arrays.sort(list);
            ArrayList<Integer> reverse = new ArrayList<>();
             for(int i = list.length - 1; i >= 0; i--) {
                 reverse.add(list[i]);
             }
             return reverse;
        }
        return bubble(list);
    }
}
