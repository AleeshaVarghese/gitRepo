package feb10;

public class ElectricCar extends  Car{
    int batteryCapacity = 70;
    public void batteryCharge(){
        System.out.println("battery charge is "+batteryCapacity+"%");
    }
}
