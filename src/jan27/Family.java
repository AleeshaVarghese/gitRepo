package jan27;

public class Family {
    String firstName;
    String lastName;
    int age;
    String houseNo = "Unit301";

    public Family(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    public void printDetails(){
        System.out.println("Family Details : "+ firstName +" "+ lastName +" "+age+" " + houseNo );
    }
}
