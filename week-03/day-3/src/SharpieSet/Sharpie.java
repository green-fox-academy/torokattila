package SharpieSet;

public class Sharpie {

    public float inkAmount;
    String color;
    float width;


    public Sharpie(String color, float width, float inkAmount) {
        this.color = color;
        this.width = width;
        this.inkAmount = inkAmount;
    }

    public void use() {
        inkAmount -= 1;
    }

}
