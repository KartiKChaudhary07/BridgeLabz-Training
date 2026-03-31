import java.util.Scanner;

class SplitWords {

    static String[] customSplit(String text) {
        int spaces = 0;
        for (int i = 0; i < text.length(); i++)
            if (text.charAt(i) == ' ') spaces++;

        String[] words = new String[spaces + 1];
        int index = 0;
        String word = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word += text.charAt(i);
            }
        }
        words[index] = word;
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Same result? " + compareArrays(custom, builtIn));
        sc.close();
    }
}
