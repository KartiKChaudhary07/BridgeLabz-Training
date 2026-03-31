import java.util.*;
class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), pow = sc.nextInt();
        int result = 1, count = 0;

        while (count < pow) {
            result *= num;
            count++;
        }
        System.out.println(result);
        sc.close();
    }
}
