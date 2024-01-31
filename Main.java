import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> bookSet = new TreeSet<>();

        Book book1 = new Book("Küçük Prens", 98, "Antoine de Saint-Exupéry", "1943");
        Book book2 = new Book("Şeker Portakalı", 208, "Jose Mauro de Vasconcelos", "1968");
        Book book3 = new Book("Kürk Mantolu Madonna", 231, " Sabahattin Ali", "1943");
        Book book4 = new Book("Beyaz Zambaklar Ülkesinde", 160, "Grigory Petrov", "1937");
        Book book5 = new Book("Hanımın Çiftliği", 264, "Orhan Kemal", "1940");

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