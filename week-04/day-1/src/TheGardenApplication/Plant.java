package TheGardenApplication;

public class Plant {
    String color;
    double water;

    public Plant() {
        this.color = "black";
        this.water = 0;
    }

    public boolean needsWater() {
        return true;
    }

    public void watering(double water) {
        this.water += water * 1;
    }

}
