import java.util.*;

public class SortStackRecursion {

    static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sortStack(s);
            insertSorted(s, x);
        }
    }

    static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(30); s.push(10); s.push(20); s.push(5);
        sortStack(s);
        System.out.println(s);
    }
}
