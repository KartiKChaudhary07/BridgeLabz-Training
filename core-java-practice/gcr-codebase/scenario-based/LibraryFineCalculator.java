import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Due days: ");
            int due = sc.nextInt();

            System.out.print("Returned after days: ");
            int returned = sc.nextInt();

            if (returned > due) {
                int fine = (returned - due) * 5;
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("No Fine");
            }
            System.out.println("----------");
        }
    }
}
