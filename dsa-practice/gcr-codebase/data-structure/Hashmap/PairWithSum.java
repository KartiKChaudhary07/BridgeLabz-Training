import java.util.*;

public class PairWithSum {
    static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            if (set.contains(target - x))
                return true;
            set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        System.out.println(hasPair(arr, 10));
    }
}
