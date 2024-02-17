package feb13.interfaces;

public class Facebook implements SocialMedia, Website, MobileApp{
    @Override
    public void mobileApp() {
        System.out.println("Welcome to Facebbok MobileApp");
    }

    @Override
    public void socialMedia() {
        System.out.println("welcome to Facebbok social Media");
    }

    @Override
    public void website() {
        System.out.println("welcome to facebook website");
    }
}
