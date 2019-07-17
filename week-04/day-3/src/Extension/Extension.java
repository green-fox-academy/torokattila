package Extension;
import java.util.Collections;
import java.util.List;

public class Extension {
    int add(int a, int b) {
        return a + b;
    }

    int maxOfThree(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    double median(List<Integer> pool) {
        Collections.sort(pool);
        double median;
        if (pool.size() % 2 == 0) {
            median = ((double) pool.get(pool.size() / 2) + (double) pool.get(pool.size() / 2 - 1)) / 2;
        } else {
            median = (double) pool.get(pool.size() / 2);
        }
        return median;
    }

    boolean isVowel(char c) {
        if(c == 'a' || c == 'A' || c == 'u' || c == 'U' || c == 'o' || c == 'O' || c == 'e' || c == 'E' || c == 'i' || c == 'I') {
            return true;
        } else {
            return false;
        }
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}