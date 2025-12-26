class Palindrome {

    static int reverse(int n) {
        int r = 0;
        while (n > 0) {
            r = r * 10 + n % 10;
            n /= 10;
        }
        return r;
    }

    static boolean isPalindrome(int n) {
        return n == reverse(n);
    }
}
