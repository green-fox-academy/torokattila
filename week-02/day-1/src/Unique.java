import java.util.ArrayList;
import java.util.Arrays;

public class Unique {

    public static void main(String[] args) {

        System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));

    }

    public static ArrayList<Integer> unique(int[] numbers) {
        ArrayList<Integer> index = new ArrayList<>();
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] != numbers[i + 1]) {
                index.add(numbers[i]);
            }
        }
        if(numbers[numbers.length - 1] != numbers[numbers.length - 2]){
            index.add(numbers[numbers.length - 1]);
        }
        return index;
    }
}
