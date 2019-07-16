package main.java.music;

public class Violin extends StringedInstrument {

    int numberOfStrings;

    public Violin(int numberOfStrings) {
        super("Violin", numberOfStrings);
    }

    @Override
    public String sound() {
        return "Screech";
    }
}
