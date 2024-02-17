package feb10.Encapsulation;

public class ReadClass {

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public ReadClass(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password){
        if(userName.equalsIgnoreCase(this.userName) && password.equalsIgnoreCase(this.password)){
            System.out.println("User is authenticated, welcome to my app ");
        }else {
            System.out.println("Invalid credentials");
        }
    }
}
