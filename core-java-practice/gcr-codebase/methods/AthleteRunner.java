import java.util.Scanner;

class AthleteRunner {

    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter; // 5 km = 5000 meters
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        System.out.println("Rounds needed = " + calculateRounds(a, b, c));
        sc.close();
    }
}
