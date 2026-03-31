class Book {
    String title;
    int publicationYear;
}

class Author extends Book {
    String name;
    String bio;

    void displayInfo() {
        System.out.println(title + " | " + publicationYear);
        System.out.println(name + " | " + bio);
    }
}