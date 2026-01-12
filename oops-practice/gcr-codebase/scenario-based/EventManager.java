import java.util.*;

public class EventManager {

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

    static void printArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] ticketPrices = {450, 1200, 300, 700, 1500, 200, 900};

        System.out.println("Before Sorting:");
        printArray(ticketPrices);

        quickSort(ticketPrices, 0, ticketPrices.length - 1);

        System.out.println("After Quick Sort (Price Ascending):");
        printArray(ticketPrices);
    }
}
