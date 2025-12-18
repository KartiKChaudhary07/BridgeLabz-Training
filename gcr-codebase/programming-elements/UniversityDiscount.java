import java.util.Scanner;

class UniversityDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee, discountPercent;

        System.out.print("Enter fee (INR): ");
        fee = sc.nextDouble();

        System.out.print("Enter discount percent: ");
        discountPercent = sc.nextDouble();

        double discountAmount = (fee * discountPercent) / 100;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount);
        System.out.println("Final discounted fee is INR " + finalFee);

        sc.close();
    }
}
