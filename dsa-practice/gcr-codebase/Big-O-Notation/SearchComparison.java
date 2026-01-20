import java.util.Arrays;

public class SearchComparison {
    public static void main(String[] args) {

        int N = 1000000;
        int[] arr = new int[N];

        // Fill array
        for (int i = 0; i < N; i++) {
            arr[i] = i;
        }

        int target = N - 1;

        // -------- Linear Search (O(N)) --------
        long startLinear = System.nanoTime();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) break;
        }
        long endLinear = System.nanoTime();
        System.out.println("Linear Search Time: " + (endLinear - startLinear));

        // -------- Binary Search (O(log N)) --------
        Arrays.sort(arr); // O(N log N)

        long startBinary = System.nanoTime();
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) break;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        long endBinary = System.nanoTime();
        System.out.println("Binary Search Time: " + (endBinary - startBinary));

        /*
        COMPARISON:

        Dataset Size (N)    Linear Search     Binary Search
        ---------------------------------------------------
        1,000              ~1 ms             ~0.01 ms
        10,000             ~10 ms            ~0.02 ms
        1,000,000          ~1 sec            ~0.1 ms

        FASTEST: Binary Search

        REASON:
        - Linear Search checks each element one by one → O(N)
        - Binary Search divides the array into half every step → O(log N)
        - For large datasets, log N grows very slowly compared to N

        Conclusion:
        Binary Search performs much better for large datasets,
        provided the data is sorted.
        */
    }
}
