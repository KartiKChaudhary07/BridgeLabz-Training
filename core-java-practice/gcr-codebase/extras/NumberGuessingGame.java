import java.util.Scanner;

public class NumberGuessingGame {

    static int generateGuess(int low, int high) {
        return (low + high) / 2; // smart guessing
    }

    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.next();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guess: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! Guessed correctly 🎉");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
}
