package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    int storeOfAmmo;
    int healthPoint;
    List<Aircraft> listOfAircrafts;

    public Carrier() {

    }

    public Carrier(int storeOfAmmo, int healthPoint) {
        this.storeOfAmmo = storeOfAmmo;
        this.healthPoint = healthPoint;
        this.listOfAircrafts = new ArrayList<>();
    }

    public void add(Aircraft aircraft) {
        this.listOfAircrafts.add(aircraft);
    }

    public void fill() {
        int refillResult;
        int neededAmmo = 0;
        for (Aircraft air : this.listOfAircrafts) {
            neededAmmo += air.maxAmmo - air.initAmmo;
        }
        try {
            if ((neededAmmo) <= this.storeOfAmmo) {
                for (Aircraft air : this.listOfAircrafts) {
                    this.storeOfAmmo = air.refill(this.storeOfAmmo);
                }
            } else {
                for (Aircraft air : this.listOfAircrafts) {
                    if (air.isPriority()) {
                        if (this.storeOfAmmo > 0) {
                            this.storeOfAmmo = air.refill(this.storeOfAmmo);
                        } else {
                            throw new ArithmeticException("No more ammo!");
                        }
                    }
                }
                for (Aircraft air : this.listOfAircrafts) {
                    if (!air.isPriority()) {
                        if (this.storeOfAmmo > 0) {
                            this.storeOfAmmo = air.refill(this.storeOfAmmo);
                        } else {
                            throw new ArithmeticException("No more ammo!");
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        this.getStatus();
    }

    private void getStatus() {
        int totalDamage = 0;
        for (Aircraft air : listOfAircrafts) {
            totalDamage += (air.baseDamage * air.initAmmo);
        }
        System.out.println("HP: " + this.healthPoint + " ,Aircraft count: " + this.listOfAircrafts.size() + " ,Ammo storage: " + this.storeOfAmmo + " ,Total damage: " + totalDamage);
        System.out.println("Aircrafts: ");
        for (Aircraft air : listOfAircrafts) {
            air.getStatus();
        }
    }

    public void fight(Carrier carrier) {
        int firePower = 0;
        for (Aircraft air : listOfAircrafts) {
            firePower += air.initAmmo * air.baseDamage;
        }
        carrier.healthPoint -= firePower;
        if (carrier.healthPoint <= 0) {
            System.out.println("It's dead Jim :(");
        }
    }

}
