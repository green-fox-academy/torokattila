package EncapsulationAndContructor;

public class Counter {

    int counter;
    int cc;

    public Counter() {

    }

    public Counter(int counter) {
        this.counter = counter;
        this.cc = counter;
    }

    public void add(int number) {
        counter += number;
    }

    public void add() {
        counter++;
    }

    public int get() {
        return counter;
    }

    public void reset() {
        counter = cc;
    }

}
