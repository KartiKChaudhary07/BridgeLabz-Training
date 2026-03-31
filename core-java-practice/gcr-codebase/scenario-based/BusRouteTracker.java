import java.util.Scanner;

public class BusRouteTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;

        while (true) {
            System.out.print("Enter distance of next stop (in km): ");
            int distance = sc.nextInt();
            totalDistance += distance;

            System.out.print("Do you want to get off? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Total distance travelled: " + totalDistance + " km");
    }
}
