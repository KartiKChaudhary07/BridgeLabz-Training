import java.util.Scanner;

class EvenIndexUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        char[] arr = sc.nextLine().toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        System.out.println(new String(arr));
    }
}
