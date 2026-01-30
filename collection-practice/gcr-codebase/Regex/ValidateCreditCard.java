public class ValidateCreditCard {
    public static void main(String[] args) {
        String card = "4123456789012345";
        String regex = "^(4\\d{15}|5\\d{15})$";

        System.out.println(card + " -> " + card.matches(regex));
    }
}
