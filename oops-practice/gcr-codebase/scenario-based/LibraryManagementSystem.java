import java.util.*;

interface FineCalculator {
    double calculateFine(int daysLate);
}

class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String msg) {
        super(msg);
    }
}

class User {
    protected int id;
    protected String name;

    User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class Member extends User implements FineCalculator {
    String type; // Student or Staff

    Member(int id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    public double calculateFine(int daysLate) {
        if (type.equalsIgnoreCase("Student"))
            return daysLate * 2;   // Rs.2 per day
        else
            return daysLate * 1;   // Rs.1 per day
    }
}

class Book {
    int bookId;
    String title;
    boolean isAvailable = true;

    Book(int id, String title) {
        this.bookId = id;
        this.title = title;
    }
}

class Transaction {
    Book book;
    Member member;

    Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    void issueBook() throws BookNotAvailableException {
        if (!book.isAvailable)
            throw new BookNotAvailableException("Book not available!");
        book.isAvailable = false;
        System.out.println("Book issued: " + book.title + " to " + member.name);
    }

    void returnBook(int daysLate) {
        book.isAvailable = true;
        double fine = member.calculateFine(daysLate);
        System.out.println("Book returned: " + book.title);
        System.out.println("Late Fine: Rs." + fine);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        try {
            Book b1 = new Book(1, "Java Programming");
            Book b2 = new Book(2, "Data Structures");

            Member m1 = new Member(101, "Kartik", "Student");
            Member m2 = new Member(102, "Rahul", "Staff");

            Transaction t1 = new Transaction(b1, m1);
            t1.issueBook();
            t1.returnBook(3); // 3 days late

            Transaction t2 = new Transaction(b2, m2);
            t2.issueBook();
            t2.returnBook(2); // 2 days late

        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
