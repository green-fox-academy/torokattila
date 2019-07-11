package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> farmAnimals;
    int slot;

    public Farm(int slot) {
        this.farmAnimals = new ArrayList<>();
        this.slot = slot;
    }

    public void addAnimal(Animal animalAdd) {
        farmAnimals.add(animalAdd);
    }

    public void breed(Animal animalAdd) {
        if(farmAnimals.size() < slot) {
            farmAnimals.add(animalAdd);
        }
    }

    public void slaughter() {
        int minHunger = farmAnimals.get(0).hunger;
        int minIndex = 0;
        for (int i = 0; i < farmAnimals.size(); i++) {
            if(farmAnimals.get(i).hunger < minHunger) {
                minHunger = farmAnimals.get(i).hunger;
                minIndex = 1;
            }
        }
        farmAnimals.remove(minIndex);
    }

}
