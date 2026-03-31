import java.util.Scanner;

class FactorsDetails {

    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0)
                factors[index++] = i;

        return factors;
    }

    static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    static long product(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double sumOfSquares(int[] f) {
        double s = 0;
        for (int x : f)
            s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] f = findFactors(n);

        System.out.print("Factors: ");
        for (int x : f) System.out.print(x + " ");

        System.out.println("\nSum = " + sum(f));
        System.out.println("Product = " + product(f));
        System.out.println("Sum of Squares = " + sumOfSquares(f));
        sc.close();
    }
}
