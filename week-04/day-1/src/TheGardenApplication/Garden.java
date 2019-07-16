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
        //We have the thirsty plants in the thirsty list
        double waterPerPlant = water/thirsty.size();
        for (Plant p : thirsty) {
            p.watering(waterPerPlant);
        }
    }

    public void info() {
        for (int i = 0; i < garden.size(); i++) {
            if(garden.get(i).needsWater()) {
                System.out.println("The " + garden.get(i) + " needs water");
            } else {
                System.out.println("The " + garden.get(i) + " doesn't need water");
            }
        }
    }


}
