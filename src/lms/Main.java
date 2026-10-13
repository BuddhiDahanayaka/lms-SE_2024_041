import lms.model.Book;
import lms.model.DVD;
import lms.model.LibraryItem;

public static void main(String[] args) {
    LibraryItem b = new Book("B001", "Clean Code", "Robert C. Martin");
    LibraryItem d = new DVD("D001", "Intro to Algorithms", 120);

    System.out.println(b.calculateLateFee(3));   // expect 30.0
    System.out.println(d.calculateLateFee(3));   // expect 75.0

    new Book("", "Nobody", "Nobody");           // expect IllegalArgumentException
}
