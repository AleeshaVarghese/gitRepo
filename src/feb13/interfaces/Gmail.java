package feb13.interfaces;

public class Gmail implements Website,MobileApp{
    @Override
    public void mobileApp() {
        System.out.println("welcome to gmail mobileApp");
    }

    @Override
    public void website() {
        System.out.println("welcome to gmail website");
    }
}
