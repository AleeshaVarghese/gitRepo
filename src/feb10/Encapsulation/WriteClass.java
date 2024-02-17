package feb10.Encapsulation;

public class WriteClass {
    private String userName;
    private String password;

    public void setPassword(String password) {
        this.password = password;
    }
    public WriteClass(String userName, String password) {
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
