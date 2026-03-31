interface SecurityUtils {

    static boolean isStrongPassword(String p) {
        return p.length() >= 8 &&
               p.matches(".*[A-Z].*") &&
               p.matches(".*[0-9].*");
    }
}

public class SecurityUtilsValidator {
    public static void main(String[] args) {
        System.out.println(
            SecurityUtils.isStrongPassword("Abc12345")
        );
    }
}
