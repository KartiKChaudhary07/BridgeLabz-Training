import java.util.*;

public class SlidingWindowMax {
    static int[] maxSlidingWindow(int[] a, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int[] res = new int[a.length - k + 1];

        for (int i = 0; i < a.length; i++) {
            while (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();

            while (!dq.isEmpty() && a[dq.peekLast()] < a[i])
                dq.pollLast();

            dq.offerLast(i);

            if (i >= k - 1)
                res[i - k + 1] = a[dq.peekFirst()];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(a, k)));
    }
}
