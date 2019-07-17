package Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(List<Integer> list) {
        int sum = 0;
        if(list == null) {
            return 0;
        }
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

}
