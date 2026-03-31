import java.util.Scanner;

class SumNatural {

    static int sum(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++)
            total += i;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));
        sc.close();
    }
}
