import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int[] aj = {3, 4, 5, 6, 7};

        int[] bj = new int[aj.length];

        for(int j = 0; j < aj.length; j++) {
            bj[aj.length - 1 - j] = aj[j];
        }

        for(int i = 0; i < aj.length; i++) {
            aj[i] = bj[i];
        }

        System.out.println(Arrays.toString(aj));
    }
}
