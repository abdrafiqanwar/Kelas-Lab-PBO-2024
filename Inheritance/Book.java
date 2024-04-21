package Inheritance;

public class Book {
    String title, author;
    int id;

    public Book(String title, String author, int id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    void displayInfo(){
        System.out.println("\nID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book = new Book("haikyuu", "furudate", 1);
        book.displayInfo();

        Fiction fiction = new Fiction(book.title, book.author, book.id, "horror", true);
        fiction.displayInfo();

        NonFiction nonFiction = new NonFiction(book.title, book.author, book.id, "matematika", "gk tau");
        nonFiction.displayInfo();
    }
}

class Fiction extends Book{
    String genre;
    
    public Fiction(String title, String author, int id, String genre, boolean bestSeller) {
        super(title, author, id);
        this.genre = genre;
        this.bestSeller = bestSeller;
    }

    boolean bestSeller;

    void displayInfo(){
        super.displayInfo();
        System.out.println("Genre: " + genre);
        System.out.println("Best Seller: " + bestSeller);
    }
}

class NonFiction extends Book{
    String subject, expertiseLevel;

    public NonFiction(String title, String author, int id, String subject, String expertiseLevel) {
        super(title, author, id);
        this.subject = subject;
        this.expertiseLevel = expertiseLevel;
    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Expertise Level: " + expertiseLevel);
    }
}
