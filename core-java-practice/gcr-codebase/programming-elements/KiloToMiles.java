import java.util.Scanner;

class KiloToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        km = input.nextDouble();

        double miles = km / 1.6;

        System.out.println("Distance in miles is " + miles);
    }
}
