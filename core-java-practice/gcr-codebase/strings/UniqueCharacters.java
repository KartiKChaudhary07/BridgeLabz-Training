import java.util.*;

public class UniqueCharacters {

    static int length(String s) {
        int i = 0;
        try {
            while (true) s.charAt(i++);
        } catch (Exception e) {}
        return i;
    }

    static char[] uniqueChars(String s) {
        int n = length(s);
        char[] temp = new char[n];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == c) found = true;

            if (!found) temp[idx++] = c;
        }
        return Arrays.copyOf(temp, idx);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] res = uniqueChars(sc.nextLine());
        System.out.println(Arrays.toString(res));
    }
}
