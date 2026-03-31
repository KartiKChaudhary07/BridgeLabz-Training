import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Movie Type (2D/3D): ");
            String movieType = sc.next();

            System.out.print("Seat Type (gold/silver): ");
            String seatType = sc.next();

            int price = 0;

            switch (seatType) {
                case "gold":
                    price = 300;
                    break;
                case "silver":
                    price = 200;
                    break;
                default:
                    System.out.println("Invalid seat");
                    continue;
            }

            if (movieType.equalsIgnoreCase("3D")) {
                price += 100;
            }

            System.out.println("Ticket Price: ₹" + price);
            System.out.println("------------------");
        }
    }
}
