import java.util.Scanner;

class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Find count of digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        // Array to store digits
        int[] digits = new int[count];
        int index = 0;

        // Store digits in array
        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Frequency array (0 to 9)
        int[] frequency = new int[10];

        // Find frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
