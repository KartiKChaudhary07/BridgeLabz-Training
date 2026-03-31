import java.util.Scanner;

class ArrayIndexDemo {

    static void generateException(String[] names) {
        System.out.println(names[10]);
    }

    static void handleException(String[] names) {
        try {
            System.out.println(names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }
        handleException(names);

        sc.close();
    }
}
