package Farm;

    public class Animal {

        String type;
        int hunger;
        int thirst = 50;

        public Animal(String type, int hunger) {
            this.type = type;
            this.hunger = hunger;
        }

        public void eat() {
            hunger--;
        }

        public void drink() {
            thirst--;
        }

        public void play() {
            hunger++;
            thirst++;
        }
}
