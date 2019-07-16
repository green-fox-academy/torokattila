package main.java.music;

public class BassGuitar extends StringedInstrument{

    int numberOfStrings;

    public BassGuitar(int numberOfStrings) {
        super("Bass Guitar" , numberOfStrings);
    }

    @Override
    public String sound() {
        return "Doom-doom-doom";
    }
}
