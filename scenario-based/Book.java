import java.util.*;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class Book {
    String title;
    String author;
    boolean available;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }
}

class Library {
    List<Book> books = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void searchBook(String keyword) {
        for (Book b : books)
            if (b.title.toLowerCase().contains(keyword.toLowerCase()))
                System.out.println(b.title + " - " + (b.available ? "Available" : "Checked Out"));
    }

    void checkoutBook(String title) throws BookNotAvailableException {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                if (!b.available)
                    throw new BookNotAvailableException("Book not available");
                b.available = false;
                System.out.println("Book checked out");
                return;
            }
        }
        System.out.println("Book not found");
    }

    public static void main(String[] args) throws Exception {
        Library lib = new Library();

        lib.addBook(new Book("Java Basics", "James"));
        lib.addBook(new Book("Data Structures", "Mark"));

        lib.searchBook("java");
        lib.checkoutBook("Java Basics");
        lib.searchBook("java");
    }
}
