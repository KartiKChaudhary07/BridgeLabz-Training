import java.util.*;
class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        System.out.println( (a > b && a > c));
        System.out.println( (b > a && b > c));
        System.out.println( (c > a && c > b));
    }
}
