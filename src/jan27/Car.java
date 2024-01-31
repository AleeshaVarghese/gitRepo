package jan27;

public class Car {
    //static method
    public static void carDetails(){
        System.out.println("Car Details");
    }
    //static block
    static {
        System.out.println("Inside static block");
    }
    //non static block
    public void run(){
        System.out.println("Inside run method");
    }
    //instance block
    {
        System.out.println("Instance block");
    }
}
