import java.util.*;
class MultiplesWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), i = 99;

        while (i > 1) {
            if (i % n == 0) System.out.println(i);
            i--;
        }
        sc.close();
    }
}
