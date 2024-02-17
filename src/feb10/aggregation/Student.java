package feb10.aggregation;

public class Student {


    int rollNo;
    String name;
    Address address;
    public Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }
    public void details(){
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(address); // toString method
        System.out.println(address.city+address.postalCode+ address.streetName);
    }
}
