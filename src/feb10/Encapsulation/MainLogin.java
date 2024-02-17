package feb10.Encapsulation;

public class MainLogin {
    public static void main(String[] args) {
        ReadClass user = new ReadClass("Aleesha", "Aleesha123@");

        //System.out.println("User Name "+user.getUserName());
        //user.login("Aleesha1", "Aleesha123@");


        WriteClass wc = new WriteClass("Aleesha", "Aleesha123@");
        wc.setPassword("Ali123");
        wc.login("Aleesha","Aleesha123@");

        BothClass bc = new BothClass("Aleesha", "Aleesha123@");
        bc.getUserName();

    }
}
