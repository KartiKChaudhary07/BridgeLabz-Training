class DigitOperations {

    static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        return sum;
    }

    static boolean isHarshad(int n) {
        return n % sumDigits(n) == 0;
    }

    static int[][] digitFrequency(int n) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;
        while (n > 0) {
            freq[n % 10][1]++;
            n /= 10;
        }
        return freq;
    }
}
