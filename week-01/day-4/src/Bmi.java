
public class Bmi {
    public static void main(String[] args) {
        double massInKg = 81.2;
        double heightInM = 1.78;

        double BMI = massInKg / (heightInM * heightInM);
        System.out.println("The Body mass index is: " + BMI + " kg/m2");
    }
}
