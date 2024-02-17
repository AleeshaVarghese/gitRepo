package feb10;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.carDetails();
        MotorCycle mc = new MotorCycle();
        mc.displayInfo();
        ElectricCar ec = new ElectricCar();
        ec.batteryCharge();
    }
}
