package feb06;

public class SmartPhone {
    String model;
    String color;
    String internet;

    public SmartPhone(String model, String color, String internet) {
        this.model = model;
        this.color = color;
        this.internet = internet;
    }
    public void printDetails(){
        System.out.println("SmartPhone Model "+ model);
        System.out.println("SmartPhone color "+ color);
        System.out.println("SmartPhone internet "+ internet);
    }
}
