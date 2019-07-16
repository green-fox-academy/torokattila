package main.java.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar(int numberOfStrings) {
        super("Electric Guitar", numberOfStrings);
    }

    @Override
    public String sound() {
        return "Twang";
    }
}
