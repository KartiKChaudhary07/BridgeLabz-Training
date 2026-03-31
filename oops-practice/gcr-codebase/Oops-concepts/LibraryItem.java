abstract class LibraryItem {
    protected String title;
    abstract int getLoanDuration();

    public void getItemDetails() {
        System.out.println(title + " Loan Days: " + getLoanDuration());
    }
}

interface Reservable {
    void reserveItem();
}

class Book extends LibraryItem {
    public int getLoanDuration() { return 14; }
}

class DVD extends LibraryItem {
    public int getLoanDuration() { return 5; }
}
class Magazine extends LibraryItem implements Reservable {
    public int getLoanDuration() { return 7; }

    public void reserveItem() {
        System.out.println("Magazine titled '" + title + "' has been reserved.");
    }
}