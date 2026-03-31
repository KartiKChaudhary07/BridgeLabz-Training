import java.util.Scanner;

class ValidateWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();

        boolean valid = true;

        if (input == null || input.length() < 6)
            valid = false;

        for (char ch : input.toCharArray()) {
            if (!Character.isLetter(ch)) {
                valid = false;
                break;
            }
        }

        if (valid)
            System.out.println("Valid Input");
        else
            System.out.println("Invalid Input");
    }
}
