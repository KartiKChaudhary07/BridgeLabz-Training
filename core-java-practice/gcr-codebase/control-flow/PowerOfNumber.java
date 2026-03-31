import java.util.*;
class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), pow = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= pow; i++)
            result *= num;

        System.out.println(result);
        sc.close();
    }
}
