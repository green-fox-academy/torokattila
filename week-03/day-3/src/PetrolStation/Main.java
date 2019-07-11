package PetrolStation;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(0, 100);
        System.out.println("The car's gasamount is: " + car.carGasAmount + " and the capacity is " + car.capacity);

        Station station = new Station();
        System.out.println("The station's gas amount is: " + station.gasAmount);
        station.refill(car);


        System.out.println("After the filling the station's gas amount is: " + station.gasAmount);
        System.out.println("After the fill the car's gas amount is: " + car.carGasAmount);
    }
}
