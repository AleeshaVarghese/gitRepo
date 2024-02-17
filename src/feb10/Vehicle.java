package feb10;

public class Vehicle {

    String make = "Toyota";
    String model = "corolla";
    int year = 2020;
    public void start(){
        System.out.println("Vehicle is stared");
    }
    public void stoped(){
        System.out.println("Vehicle is stopped");
    }
    public void displayInfo(){
        System.out.println("Vehicle make : "+make);
        System.out.println("Vehicle model : "+model);
        System.out.println("Vehicle year : "+year);
    }
}
