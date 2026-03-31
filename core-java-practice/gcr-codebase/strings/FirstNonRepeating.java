import java.util.*;

public class FirstNonRepeating {

    static char find(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = find(sc.nextLine());
        System.out.println(ch == '\0' ? "No unique char" : ch);
    }
}
