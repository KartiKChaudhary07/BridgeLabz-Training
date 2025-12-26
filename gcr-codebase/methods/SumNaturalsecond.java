import java.util.Scanner;

class SumNaturalsecond {

    static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int r1 = sumRecursive(n);
        int r2 = sumFormula(n);

        System.out.println("Recursive Sum = " + r1);
        System.out.println("Formula Sum = " + r2);
        sc.close();
    }
}
