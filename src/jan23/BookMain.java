package jan23;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.printDetails();

        Book book1 = new Book("abcc","ali",2023);
        book1.printDetails();
    }
}
