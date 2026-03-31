import java.util.*;

public class CountingSortAges {
    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 12};
        int max = 18;
        int[] count = new int[max + 1];

        for (int age : ages)
            count[age]++;

        int index = 0;
        for (int i = 10; i <= max; i++) {
            while (count[i]-- > 0)
                ages[index++] = i;
        }
        System.out.println(Arrays.toString(ages));
    }
}
