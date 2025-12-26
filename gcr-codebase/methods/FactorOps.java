class FactorOps {

    static int[] factors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;
        int[] f = new int[count];
        int idx = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) f[idx++] = i;
        return f;
    }

    static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    static long product(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double cubeProduct(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }
}
