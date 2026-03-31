
import java.util.Scanner;

class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double feet;
        System.out.print("Enter distance in feet: ");
        feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " + yards +
                " and in miles is " + miles);
    }
}
