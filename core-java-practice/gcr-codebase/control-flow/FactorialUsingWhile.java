import java.util.*;
class FactorialUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact = 1;

        while (n > 0) fact *= n--;
        System.out.println("Factorial = " + fact);
        sc.close();
    }
}
