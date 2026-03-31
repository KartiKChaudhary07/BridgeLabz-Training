public class StringConcatComparison {

    public static void main(String[] args) {

        int N = 1000000;

        // 1. Using String (Immutable) - O(N^2)
        long startString = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < N; i++) {
            s = s + "A";  
            // Creates a NEW object every time -> very slow
        }
        long endString = System.currentTimeMillis();
        System.out.println("String Time: " + (endString - startString) + " ms");

        // 2. Using StringBuilder (Mutable, Fast) - O(N)
        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append("A");  
            // Same object modified, no new object creation
        }
        long endSB = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endSB - startSB) + " ms");

        // 3. Using StringBuffer (Mutable, Thread-safe) - O(N)
        long startSF = System.currentTimeMillis();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sf.append("A");  
            // Synchronized methods -> thread-safe but little slow
        }
        long endSF = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endSF - startSF) + " ms");

        /*
        COMPARATIVE ANALYSIS:

        Operations (N)     String        StringBuilder    StringBuffer
        ---------------------------------------------------------------
        1,000              ~10 ms        ~1 ms            ~2 ms
        10,000             ~1 sec        ~10 ms           ~12 ms
        1,000,000          ~30 min       ~50 ms           ~60 ms

        TIME COMPLEXITY:
        String        -> O(N^2) (Immutable, creates new object every time)
        StringBuilder -> O(N)   (Mutable, no synchronization, FASTEST)
        StringBuffer  -> O(N)   (Mutable, synchronized, slightly slower)

        FASTEST: StringBuilder

        REASONS:
        - No new object creation
        - No synchronization overhead
        - Direct memory modification

        CONCLUSION:
        StringBuilder & StringBuffer are much more efficient than String.
        Use StringBuilder for single-threaded operations.
        Use StringBuffer for multi-threaded operations.
        */
    }
}
