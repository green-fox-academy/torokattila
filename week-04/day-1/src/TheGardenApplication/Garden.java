package TheGardenApplication;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> garden = new ArrayList();

    public void add(Plant plant) {
        garden.add(plant);
    }

    public void watering(double water) {
        ArrayList<Plant> thirsty = new ArrayList<>();
        System.out.println("Watering with " + water);
        for (int i = 0; i < garden.size(); i++) {
            if (garden.get(i).needsWater()) {
                thirsty.add(garden.get(i));
            }
        }
    }

    public void info() {
        for (int i = 0; i < garden.size(); i++) {
            
        }
    }


}
