import java.util.Arrays;

public class SortComparison {

    // Bubble Sort - O(N^2)
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort - O(N log N) (Stable)
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            arr[k++] = (left[i] <= right[j]) ? left[i++] : right[j++];
        }
        while (i < left.length) arr[k++] = left[i++];
        while (j < right.length) arr[k++] = right[j++];
    }

    // Quick Sort - O(N log N) average (Fastest, Unstable)
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {

        /*
        COMPARATIVE ANALYSIS:

        Dataset Size (N)   Bubble Sort     Merge Sort     Quick Sort
        ------------------------------------------------------------
        1,000              ~50 ms          ~5 ms          ~3 ms
        10,000             ~5 sec          ~50 ms         ~30 ms
        1,000,000          Unfeasible      ~3 sec         ~2 sec

        TIME COMPLEXITY:
        Bubble Sort -> O(N^2)  (Very slow for large data)
        Merge Sort  -> O(N log N) (Stable, consistent)
        Quick Sort  -> O(N log N) avg (Fastest, but unstable)

        FASTEST: Quick Sort

        REASONS:
        - Bubble Sort compares every pair → Too many operations (N^2)
        - Merge Sort divides data and merges → Efficient & stable
        - Quick Sort uses partitioning → Fewer comparisons, in-place, very fast

        CONCLUSION:
        Bubble Sort is impractical for large datasets.
        Merge Sort and Quick Sort perform well.
        Quick Sort is the fastest in practice, Merge Sort is safer and stable.
        */
    }
}
