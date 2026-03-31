import java.util.*;

public class MergeSortBooks {
    static void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    static void merge(int[] a, int l, int m, int r) {
        int[] temp = new int[r - l + 1];
        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r)
            temp[k++] = (a[i] < a[j]) ? a[i++] : a[j++];

        while (i <= m) temp[k++] = a[i++];
        while (j <= r) temp[k++] = a[j++];

        for (i = l, k = 0; i <= r; i++, k++)
            a[i] = temp[k];
    }

    public static void main(String[] args) {
        int[] prices = {450, 120, 300, 200};
        mergeSort(prices, 0, prices.length - 1);
        System.out.println(Arrays.toString(prices));
    }
}
