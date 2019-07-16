package TheGardenApplication;

public class Flower extends Plant {

    public Flower() {}

    public Flower(String color, double water) {
        this.color = color;
        this.water = water;
    }

    public boolean needsWater() {
        return this.water < 5.0;
    }

    public void watering(double water) {
        this.water += water * 0.75;
    }

    @Override
    public String toString() {
        return color + " Flower";
    }
}
