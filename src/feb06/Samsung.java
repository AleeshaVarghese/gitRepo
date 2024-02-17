package feb06;

public class Samsung extends SmartPhone{
    String color;
    String bodyType;
    public Samsung(String model, String color, String internet, String color1, String bodyType) {
        super(model, color, internet);
        this.color = color1;
        this.bodyType = bodyType;
    }




    public void samsungDetails(){
        printDetails();
        System.out.println("samsung color "+ color);
        System.out.println("samsung bodytype "+ bodyType);

    }
}
