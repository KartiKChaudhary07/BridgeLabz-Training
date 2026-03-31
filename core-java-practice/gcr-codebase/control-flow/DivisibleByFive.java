import java.util.*;
class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num + " divisible by 5? " + (num % 5 == 0));
        sc.close();
    }
}
