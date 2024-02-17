package feb13.interfaces;

public class MainDemo {
    public static void main(String[] args) {
        Facebook fb = new Facebook();
        Gmail gmail = new Gmail();
        Snapchat sc = new Snapchat();

        fb.mobileApp();
        fb.socialMedia();
        fb.website();
        System.out.println();
        gmail.mobileApp();
        gmail.website();
        System.out.println();
        sc.mobileApp();
        sc.socialMedia();
    }

}
