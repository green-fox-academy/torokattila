package TheGardenApplication;

public class Tree extends Plant{

    public Tree() {}

    public Tree(String color, double water) {
        this.color = color;
        this.water = water;
    }


    public boolean needsWater() {
        return this.water < 10.0;
    }

    public void watering(double water) {
        this.water += water * 0.4;
    }

}
