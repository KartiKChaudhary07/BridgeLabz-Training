import java.util.Scanner;

public class TemperatureConverter {

    static double cToF(double c) {
        return (c * 9 / 5) + 32;
    }

    static double fToC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        double c = sc.nextDouble();

        System.out.println("Fahrenheit: " + cToF(c));
    }
}
