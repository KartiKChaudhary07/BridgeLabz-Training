import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Utility utility = new Utility();

        System.out.println("Enter the Goods Transport details");
        String input = sc.nextLine();

        GoodsTransport gt = utility.parseDetails(input);
        if (gt == null)
            return;

        System.out.println("Transporter id : " + gt.getTransportId());
        System.out.println("Date of transport : " + gt.getTransportDate());
        System.out.println("Rating of the transport : " + gt.getTransportRating());

        System.out.println("Vehicle for transport : " + gt.vehicleSelection());
        System.out.println("Total charge : " + gt.calculateTotalCharge());
    }
}
