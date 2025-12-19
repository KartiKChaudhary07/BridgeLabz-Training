import java.util.*;
class CountdownWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        scanner.close();
    }
}
