
class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "A man a plan a canal Panama";

        if (p.isPalindrome())
            System.out.println(p.text + " is palindrome");
        else
            System.out.println(p.text + " is not Palindrome");
    }
}
