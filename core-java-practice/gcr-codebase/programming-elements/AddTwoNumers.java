import java.util.*;

public class AddTwoNumers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        sc.close();
    }
}
