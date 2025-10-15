public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year,  Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.printf("Name: %s \nYear: %d \n", name,  year);
        System.out.println("Books available: \n");
        for (Book book : books) {
            System.out.println(book.displayInformation());
        }

    }

}
