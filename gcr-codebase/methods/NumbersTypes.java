class NumberTypes {

    static int sumDivisors(int n) {
        int s = 0;
        for (int i = 1; i <= n / 2; i++)
            if (n % i == 0) s += i;
        return s;
    }

    static boolean isPerfect(int n) {
        return sumDivisors(n) == n;
    }

    static boolean isAbundant(int n) {
        return sumDivisors(n) > n;
    }

    static boolean isDeficient(int n) {
        return sumDivisors(n) < n;
    }

    static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            int d = temp % 10;
            int f = 1;
            for (int i = 1; i <= d; i++) f *= i;
            sum += f;
            temp /= 10;
        }
        return sum == n;
    }
}
