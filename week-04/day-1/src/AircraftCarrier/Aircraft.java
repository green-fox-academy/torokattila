package AircraftCarrier;

public class Aircraft {

    int maxAmmo;
    int baseDamage;
    int initAmmo;
    String type;
    boolean priority;

    public Aircraft() {

    }

    public String getType() {
        return this.type;
    }

    public void getStatus() {
        System.out.println("Type: " + this.getType() + " Ammo: " + this.initAmmo + " Base damage: " + this.baseDamage + " All damage: " + (this.initAmmo * this.baseDamage));
    }

    public boolean isPriority() {
        return this.priority;
    }

    public int fight() {
        int damage = initAmmo * baseDamage;
        this.initAmmo = 0;
        return damage;
    }

    public int refill(int remainingAmmo) {
        int missing = this.maxAmmo - this.initAmmo;
        int taken = 0;
        if (taken <= remainingAmmo) {
            taken = missing;
            this.initAmmo = this.maxAmmo;
        } else {
            taken = remainingAmmo;
            this.initAmmo += taken;
        }
        remainingAmmo -= taken;
        return remainingAmmo;
    }

}
