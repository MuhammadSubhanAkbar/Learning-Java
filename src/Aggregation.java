public class Aggregation {
    public static void main(String[] args) {

        //AGGREGATION == Represent a "has-a" relationship between two objects.
        //               One object contains another object a part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("Zayan Physics 12", "Azhar Iqbal", 234);
        Book book2 = new Book("Computer Science ", "Tariq Mahmood", 287);
        Book book3 = new Book("English Grammar & Composition", "Punjab TextBook board", 146);

        Book [] books = {book1, book2, book3};

//        for (Book book : books) {
//            System.out.println(book.displayInformation()    );
//        }

        Library library = new Library("Manciple Library", 2025, books);

        library.displayInfo();


    }
}
