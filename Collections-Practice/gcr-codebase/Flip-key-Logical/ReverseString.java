import java.util.Scanner;

class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        StringBuilder sb = new StringBuilder(input);
        System.out.println(sb.reverse().toString());
    }
}
