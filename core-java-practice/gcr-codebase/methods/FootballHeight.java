class FootballHeights {

    static int sum(int[] h) {
        int s = 0;
        for (int x : h) s += x;
        return s;
    }

    static double mean(int[] h) {
        return sum(h) / (double) h.length;
    }

    static int shortest(int[] h) {
        int min = h[0];
        for (int x : h) if (x < min) min = x;
        return min;
    }

    static int tallest(int[] h) {
        int max = h[0];
        for (int x : h) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];

        for (int i = 0; i < 11; i++) {
            heights[i] = 150 + (int)(Math.random() * 101);
        }

        System.out.println("Shortest = " + shortest(heights));
        System.out.println("Tallest = " + tallest(heights));
        System.out.println("Mean = " + mean(heights));
    }
}
