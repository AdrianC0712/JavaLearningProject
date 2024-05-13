package bookcollectiontask;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args) {
        // Crearea a două obiecte de tip Library
        Library library1 = new Library("Prima Librarie");
        Library library2 = new Library("Librariea nr.2");

        // Adăugarea cărților în biblioteca
        library1.addBook(new Book("Harry Potter", "J.K. Rowling"));
        library1.addBook(new Book("Lord of the Rings", "J.R.R. Tolkien"));
        library2.addBook(new Book("Java Programming", "John Doe"));
        library2.addBook(new Book("Python Basics", "Jane Smith"));

        // Afișarea cărților din ambele biblioteca
        library1.printBooks();
        library2.printBooks();

        // Eliminarea carte din biblioteca
        Book bookToRemove = new Book("1984", "George Orwell");
        library1.removeBook(bookToRemove);

        // Afisarea cartii actualizate in biblioteca
        library1.printBooks();
        library2.printBooks();
        // Crearea unui Map
        Map<String, Library> libraryMap = new HashMap<>();
        // Stcarea citorva librarii in Map
        libraryMap.put("Adresa1", library1);
        libraryMap.put("Adresa2", library2);

        // Verifica daca o anumita valoare exista in Map
        String valoareaCautata = "Adresa1";
        boolean existaValoarea = libraryMap.containsKey(valoareaCautata);
        System.out.println("Valoarea \"" + valoareaCautata + "\" exista in Map? " + existaValoarea);

        String valoareaCautata2 = library2.getName();
        existaValoarea = checkIfValueExistInMap(libraryMap, valoareaCautata2);
        System.out.println("Valoarea \"" + valoareaCautata2 + "\" exista in Map? " + existaValoarea);

        // Printeaza cartile care se afle pe Adresa1
        libraryMap.get("Adresa1").printBooks();

        // Printeaza cartile care se afle pe Adresa2
        libraryMap.get("Adresa2").printBooks();


    }

    public static boolean checkIfValueExistInMap(Map<String,Library> searchMap, String searchName)
    {

        for (Map.Entry<String,Library> set: searchMap.entrySet())
        {
            if (set.getValue().getName() == searchName)
            {
                return true;
            }

        }
        return false;
    }
}
