class NumberChecker {

    static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    static boolean isDuck(int n) {
        for (int d : digits(n)) if (d == 0) return true;
        return false;
    }

    static boolean isArmstrong(int n) {
        int[] d = digits(n);
        int sum = 0;
        for (int x : d) sum += Math.pow(x, d.length);
        return sum == n;
    }

    static int[] largestSecondLargest(int[] d) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > max) { second = max; max = x; }
            else if (x > second && x != max) second = x;
        }
        return new int[]{max, second};
    }

    static int[] smallestSecondSmallest(int[] d) {
        int min = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < min) { second = min; min = x; }
            else if (x < second && x != min) second = x;
        }
        return new int[]{min, second};
    }
}
