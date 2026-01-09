import java.util.*;

class Flight {
    String flightNo;
    String source;
    String destination;

    Flight(String flightNo, String source, String destination) {
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
    }

    void display() {
        System.out.println(flightNo + " : " + source + " -> " + destination);
    }
}

public class FlightBookingSystem {

    static Flight[] flights = {
        new Flight("AI101", "Delhi", "Mumbai"),
        new Flight("AI102", "Delhi", "Pune"),
        new Flight("AI103", "Mumbai", "Chennai")
    };

    static List<Flight> bookings = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    static void searchFlight() {
        System.out.print("Enter Source: ");
        String src = sc.next();
        System.out.print("Enter Destination: ");
        String dest = sc.next();

        for (Flight f : flights) {
            if (f.source.equalsIgnoreCase(src) &&
                f.destination.equalsIgnoreCase(dest)) {
                f.display();
            }
        }
    }

    static void bookFlight() {
        System.out.print("Enter Flight Number: ");
        String fno = sc.next();

        for (Flight f : flights) {
            if (f.flightNo.equalsIgnoreCase(fno)) {
                bookings.add(f);
                System.out.println("Flight Booked Successfully");
                return;
            }
        }
        System.out.println("Flight Not Found");
    }

    static void showBookings() {
        System.out.println("Your Bookings:");
        for (Flight f : bookings) {
            f.display();
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1.Search Flight\n2.Book Flight\n3.View Bookings\n4.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: searchFlight(); break;
                case 2: bookFlight(); break;
                case 3: showBookings(); break;
                case 4: System.exit(0);
            }
        }
    }
}
