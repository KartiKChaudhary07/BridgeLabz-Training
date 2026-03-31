public class ValidateHexColor {
    public static void main(String[] args) {
        String[] colors = {"#FFA500", "#ff4500", "#123"};
        String regex = "^#[0-9a-fA-F]{6}$";

        for (String c : colors) {
            System.out.println(c + " -> " + c.matches(regex));
        }
    }
}
