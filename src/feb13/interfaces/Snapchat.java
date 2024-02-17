package feb13.interfaces;

public class Snapchat implements SocialMedia, MobileApp{
    @Override
    public void mobileApp() {
        System.out.println("welcome snapchat mobileapp");
    }

    @Override
    public void socialMedia() {
        System.out.println("welcome to snapchat social media");
    }
}
