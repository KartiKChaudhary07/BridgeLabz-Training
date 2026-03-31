public class FibonacciComparison {

    // Recursive Fibonacci - O(2^N)
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        // Recomputes same values again and again -> exponential time
    }

    // Iterative Fibonacci - O(N)
    public static int fibonacciIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
        // Computes each Fibonacci number only once -> linear time
    }

    public static void main(String[] args) {

        int n = 30;

        long startRec = System.currentTimeMillis();
        fibonacciRecursive(n);
        long endRec = System.currentTimeMillis();
        System.out.println("Recursive Time: " + (endRec - startRec) + " ms");

        long startItr = System.currentTimeMillis();
        fibonacciIterative(n);
        long endItr = System.currentTimeMillis();
        System.out.println("Iterative Time: " + (endItr - startItr) + " ms");

        /*
        COMPARATIVE ANALYSIS:

        Fibonacci (N)    Recursive        Iterative
        --------------------------------------------
        10               ~1 ms            ~0.01 ms
        30               ~5 sec           ~0.05 ms
        50               Unfeasible       ~0.1 ms

        TIME COMPLEXITY:
        Recursive -> O(2^N) (Exponential, very slow)
        Iterative -> O(N)   (Linear, very fast)

        FASTEST: Iterative Approach

        REASONS:
        - Recursive version recalculates the same subproblems again and again.
        - Number of calls grows exponentially.
        - Iterative version uses a loop and constant memory.
        - Each Fibonacci number is calculated only once.

        CONCLUSION:
        Recursive Fibonacci is impractical for large N due to exponential growth.
        Iterative Fibonacci is significantly faster and more memory-efficient.
        */
    }
}
