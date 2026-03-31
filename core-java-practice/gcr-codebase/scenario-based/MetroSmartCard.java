import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 100;

        while (balance > 0) {
            System.out.println("Current Balance: ₹" + balance);
            System.out.print("Enter distance (-1 to quit): ");
            int distance = sc.nextInt();

            if (distance == -1) {
                break;
            }

            int fare = (distance <= 5) ? 10 : 20;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare ₹" + fare + " deducted");
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }

        System.out.println("Journey ended. Final Balance: ₹" + balance);
    }
}
