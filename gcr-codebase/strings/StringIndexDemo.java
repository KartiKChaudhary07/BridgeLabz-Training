import java.util.Scanner;

class StringIndexDemo {

    static void generateException(String text) {
        System.out.println(text.charAt(50));
    }

    static void handleException(String text) {
        try {
            System.out.println(text.charAt(50));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        handleException(text);

        sc.close();
    }
}
