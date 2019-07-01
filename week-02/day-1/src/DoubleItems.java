public class DoubleItems {

    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};

        for(int i= 0; i < numList.length; i++) {
            numList[i] *= 2;
        }

        for(int num : numList) {
            System.out.println(num + " ");
        }
    }
}
