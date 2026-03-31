import java.util.*;
class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), gf = 1;

        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) {
                gf = i;
                break;
            }
        }
        System.out.println(gf);
        sc.close();
    }
}
