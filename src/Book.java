public class Book {

    String title;
    String author;
    int pages;

    Book (String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    String displayInformation(){
        return "Title: " + this.title + "\nAuthor: " + this.author + "\nPages: " + this.pages + "\n";
    }
}
