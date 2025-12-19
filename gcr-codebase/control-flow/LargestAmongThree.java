import java.util.*;
class LargestCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        System.out.println( (a > b && a > c));
        System.out.println( (b > a && b > c));
        System.out.println( (c > a && c > b));
    }
}
