import java.util.Scanner;

class RemoveEvenASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine().toLowerCase();

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if ((int) ch % 2 != 0) {
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}
