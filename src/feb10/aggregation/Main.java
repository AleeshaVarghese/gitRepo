package feb10.aggregation;

public class Main {
    public static void main(String[] args) {
    Address address = new Address("156 Holborne Ave ", "East York", " M4C2R6");
    Student student = new Student(101, "Aleesha", address);
    student.details();
    }
}
