package AircraftCarrier;

public class Battle {

    public static void main(String[] args) {
        Carrier carr1 = new Carrier(10, 5000);
        Carrier carr2 = new Carrier(10, 3000);

        carr1.add(new F16());
        carr1.add(new F16());
        carr1.add(new F35());
        carr1.add(new F35());
        carr1.add(new F16());
        carr1.add(new F35());

        carr2.add(new F35());
        carr2.add(new F16());
        carr2.add(new F35());
        carr2.add(new F35());
        carr2.add(new F16());
        carr2.add(new F35());

        carr1.fill();
        carr2.fill();
        carr1.fight(carr2);
    }

}
