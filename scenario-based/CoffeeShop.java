import java.util.Scanner;

class CoffeeShop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("Enter coffee (tea/coffee) or exit: ");
            String coffee = sc.next();

            if (coffee.equals("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int price = 0;

            if (coffee.equals("tea")) {
                price = 20;
            } else if (coffee.equals("coffee")) {
                price = 50;
            } else {
                System.out.println("Wrong choice");
                continue;
            }

            int bill = price * quantity;
            int gst = bill * 5 / 100;
            int total = bill + gst;

            System.out.println("Bill = " + bill);
            System.out.println("GST = " + gst);
            System.out.println("Total = " + total);
            System.out.println();
        }

        sc.close();
    }
}
