class LibraryBook {
    String title;
    String author;
    double price;
    boolean available = true;

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }
}
