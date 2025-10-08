package POO;

public class Book {
    // Attributes
    String title;
    String author;
    Integer publishYear;

    // Constructor
    public Book(String title, String author, Integer publishYear){
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    // Methods
    public void showBooksData(){
        System.out.println("Title: " + title + ", Author: " + author + ", Age: " + publishYear + " years");
    }
}
