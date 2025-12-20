import java.util.Scanner;

class Numbercheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is positive even");
                else
                    System.out.println(num + " is positive odd");
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println("Number is zero");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and last are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First is greater");
        else
            System.out.println("Last is greater");

        sc.close();
    }
}
