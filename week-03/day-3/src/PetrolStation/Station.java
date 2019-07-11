package PetrolStation;

public class Station {

    int gasAmount = 1000;

    public void refill(Car car) {
        gasAmount = gasAmount - (car.capacity - car.carGasAmount);
        car.carGasAmount = car.capacity;
    }
}
