import java.util.*;

public class HeapSortSalary {
    static void heapify(int[] a, int n, int i) {
        int largest = i, l = 2*i+1, r = 2*i+2;

        if (l < n && a[l] > a[largest]) largest = l;
        if (r < n && a[r] > a[largest]) largest = r;

        if (largest != i) {
            int temp = a[i]; a[i] = a[largest]; a[largest] = temp;
            heapify(a, n, largest);
        }
    }

    static void heapSort(int[] a) {
        int n = a.length;
        for (int i = n/2 - 1; i >= 0; i--)
            heapify(a, n, i);

        for (int i = n-1; i > 0; i--) {
            int temp = a[0]; a[0] = a[i]; a[i] = temp;
            heapify(a, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] salary = {60000, 45000, 80000, 50000};
        heapSort(salary);
        System.out.println(Arrays.toString(salary));
    }
}
