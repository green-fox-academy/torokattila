import java.util.ArrayList;

public class SubInt {

    public static void main(String[] args) {

        System.out.println(subInt(1, new int[] {1, 21, 43, 51}));
        System.out.println(subInt(9, new int[] {1, 21, 43, 51}));

    }

    public static ArrayList<Integer> subInt(int num, int[] arr) {
        String[] strArray = new String[arr.length];
        String strNumber = Integer.toString(num);
        ArrayList<Integer> index = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            strArray[i] = String.valueOf(arr[i]);

            if(strArray[i].contains(strNumber)) {
                index.add(findIndex(strArray[i], strArray));
            }
        }
        return index;
    }

    public static int findIndex(String element, String[] strNewArray) {
        for (int j = 0; j < strNewArray.length; j++) {
            if(strNewArray[j] == element) {
                return j;
            }
        }
        return -1;
    }
}
