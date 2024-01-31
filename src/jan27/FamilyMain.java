package jan27;

public class FamilyMain {
    public static void main(String[] args) {
        Family family1 = new Family("Aleesha","Varghese", 26);
        Family family2 = new Family("Ashna","Varghese", 24);
        Family family3 = new Family("Varghese","Thomas", 61);
        Family family4 = new Family("Baby","Joseph", 50);

        family1.printDetails();
        family2.printDetails();
        family3.printDetails();
        family4.printDetails();
    }
}
