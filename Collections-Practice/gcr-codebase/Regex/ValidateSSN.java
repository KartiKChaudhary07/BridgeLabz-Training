public class ValidateSSN {
    public static void main(String[] args) {
        String[] ssn = {"123-45-6789", "123456789"};
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        for (String s : ssn) {
            System.out.println(s + " -> " + s.matches(regex));
        }
    }
}
