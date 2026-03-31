import java.util.Scanner;

class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        if (input == null || input.length() < 6) {
            System.out.println("Invalid Input");
            return;
        }

        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                System.out.println("Invalid Input");
                return;
            }
        }

        input = input.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch % 2 != 0)
                sb.append(ch);
        }

        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0)
                sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
        }

        System.out.println("The generated key is - " + sb);
    }
}

