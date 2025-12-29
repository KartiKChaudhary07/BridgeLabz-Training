import java.util.Scanner;

public class Calculator {

    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static double div(int a, int b) { return (double) a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Add: " + add(a, b));
        System.out.println("Sub: " + sub(a, b));
        System.out.println("Mul: " + mul(a, b));
        System.out.println("Div: " + div(a, b));
    }
}
