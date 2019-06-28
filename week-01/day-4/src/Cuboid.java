public class Cuboid {
    public static void main(String[] args) {
        double side1 = 12.345;
        double side2 = 5.43;
        double side3 = 7.23;

        double area = (2* ((side1 * side2) + (side2 * side3) + (side3 * side1)));
        double volume = side1 * side2 * side3;
        System.out.println("The total surface area of cuboid is: " + area + '\n' + "And the volume of cuboid is: " + volume);
    }
}
