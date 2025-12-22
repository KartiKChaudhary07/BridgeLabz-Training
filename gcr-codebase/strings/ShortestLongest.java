import java.util.Scanner;

class ShortestLongest {

    static String[] split(String text) {
        return text.split(" ");
    }

    static int[] findShortLong(String[] words) {
        int min = words[0].length();
        int max = words[0].length();
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < min) {
                min = words[i].length();
                minIndex = i;
            }
            if (words[i].length() > max) {
                max = words[i].length();
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = split(text);
        int[] result = findShortLong(words);

        System.out.println("Shortest: " + words[result[0]]);
        System.out.println("Longest: " + words[result[1]]);
        sc.close();
    }
}
