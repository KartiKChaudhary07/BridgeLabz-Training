import java.util.*;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

public class SmartShelf {

    // Insertion Sort by Book Title
    static void insertionSort(Book[] books) {
        for (int i = 1; i < books.length; i++) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
                books[j + 1] = books[j];
                j--;
            }
            books[j + 1] = key;
        }
    }

    static void printBooks(Book[] books) {
        for (Book b : books) {
            System.out.print(b.title + "  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book[] shelf = {
            new Book("Java"),
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Computer Networks"),
            new Book("Operating Systems")
        };

        System.out.println("Before Sorting:");
        printBooks(shelf);

        insertionSort(shelf);

        System.out.println("After Insertion Sort (Alphabetical):");
        printBooks(shelf);
    }
}
