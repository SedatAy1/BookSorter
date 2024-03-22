import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> bookSet = new TreeSet<>();

        Book book1 = new Book("Suç ve Ceza", 687, "Fyodor Mihayloviç Dostoyevski", "1866");
        Book book2 = new Book("Anna Karenina", 1062, "Lev Nikolayeviç Tolstoy", "1877");
        Book book3 = new Book("Uğultulu Tepeler", 408, "Emily Bronte", "1943");
        Book book4 = new Book("Beyaz Zambaklar Ülkesinde", 160, "Grigory Petrov", "1847");
        Book book5 = new Book("Altıncı Koğuş", 68, "Anton Pavloviç Çehov", "1892");

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        System.out.println("Books sorted by title: ");
        for (Book book: bookSet) {
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount= new TreeSet<>(Comparator.comparing(Book::getPageCount));

        bookSetByPageCount.addAll(bookSet);

        System.out.println("\nBooks sorted by page count: ");
        for (Book book: bookSetByPageCount){
            System.out.println(book);
        }
    }
}