import java.util.*;

public class CharFrequency {

    static int[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        int count = 0;
        for (int f : freq) if (f > 0) count++;

        int[][] res = new int[count][2];
        int idx = 0;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) {
                res[idx][0] = i;
                res[idx++][1] = freq[i];
            }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] res = frequency(sc.nextLine());
        for (int[] r : res)
            System.out.println((char) r[0] + " : " + r[1]);
    }
}

