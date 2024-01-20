package jan20;

public class StudentMain {

    public static void main(String[] args) {

        Student student = new Student();
        student.id = 101;
        student.firstName = "Aleesha";
        student.lastName = "Varghese";
        student.email = "aleeshavarghese97@gamil.com";

        System.out.println("************Student Details**********");
        System.out.println("Student ID : "+student.id);
        System.out.println("First Name : "+student.firstName);
        System.out.println("Last Name : "+student.lastName);
        System.out.println("Email : "+student.email);

        System.out.println("************Student Activities************");
        student.study();
        student.sleep();
        student.eat();

    }
}
