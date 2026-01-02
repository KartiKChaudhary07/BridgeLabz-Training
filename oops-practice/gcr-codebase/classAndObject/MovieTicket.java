
class MovieTicket {
    boolean booked = false;

    void book(String movie, String seat, double price) {
        if (!booked) {
            booked = true;
            System.out.println("Ticket booked for movie: " + movie);
            System.out.println("Seat Number: " + seat);
            System.out.println("Price: $" + price);
        } else {
            System.out.println("House full!!! sorry..... Ticket already booked");
        }
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        System.out.println("Ticket have not booked yet....");
        t.book("Dragon", "A10", 120);
        t.book("Dragon", "A10", 120);
    }
}
