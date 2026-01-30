public class ValidateLicensePlate {
    public static void main(String[] args) {
        String[] plates = {"AB1234", "A12345"};
        String regex = "^[A-Z]{2}[0-9]{4}$";

        for (String p : plates) {
            System.out.println(p + " -> " + p.matches(regex));
        }
    }
}
