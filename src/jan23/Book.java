package jan23;

public class Book {

    String title;
    String author;
    int publicationYear;

    Book(){
        title = "qwerty";
        author = "aleesha";
        publicationYear = 2024;
    }

    Book(String title, String author,int year){
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public void printDetails(){
        System.out.println("Title : "+title);
        System.out.println("author : " +author);
        System.out.println("publicationYear : "+publicationYear);
    }
}
