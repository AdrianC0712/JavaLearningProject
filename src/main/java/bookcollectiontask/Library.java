package bookcollectiontask;
import java.util.ArrayList;
import java.util.List;

public class Library
{
    private List<Book> bookList;
    private String name;

    public Library(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public boolean hasBook(Book book) {
        return bookList.contains(book);
    }

    public int getTotalBooks() {
        return bookList.size();
    }

    public void printBooks() {
        System.out.println("Cărți disponibile în " + name + ":");
        for (Book book : bookList) {
            System.out.println("Titlu: " + book.getTitle() + ", Autor: " + book.getAuthor());
        }
    }
    public String getName()
    {
        return name;
    }
}
