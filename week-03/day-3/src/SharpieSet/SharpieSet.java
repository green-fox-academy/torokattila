package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    public List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public void addSharpie(Sharpie sharpieToAdd) {
        sharpies.add(sharpieToAdd);
    }

    public int countUsable() {
        int sharpieCount = 0;

        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
               sharpieCount++;
            }
        }
        return sharpieCount;
    }

    public int removeTrash() {
        List<Sharpie> temp = new ArrayList<>();

        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount <= 0) {
                temp.add(sharpies.get(i));
            }
        }
        sharpies.removeAll(temp);
        return sharpies.size();
    }
}
