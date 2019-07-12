public class NumberAdder {

    public static void main(String[] args) {
        int sum = addNumbers(6);
        System.out.println(sum);
    }

    private static int addNumbers(int limit) {
        return addNumbers2(limit, 0);
    }

    private static int addNumbers2(int limit, int sum) {
        if (limit == 0) {
            return 0;
        }
        return limit + addNumbers2(limit - 1, sum + limit);
    }

}
