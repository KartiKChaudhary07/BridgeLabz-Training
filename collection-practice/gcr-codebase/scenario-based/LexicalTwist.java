import java.util.*;

class LexicalTwist {

    // Check if input contains more than one word
    private static boolean isInvalidWord(String word) {
        return word.trim().contains(" ");
    }

    // Check if second word is reverse of first (case-insensitive)
    private static boolean isReverse(String first, String second) {
        StringBuilder sb = new StringBuilder(first);
        return sb.reverse().toString().equalsIgnoreCase(second);
    }

    // Replace vowels with '@'
    private static String replaceVowels(String str) {
        return str.replaceAll("[aeiou]", "@");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        if (isInvalidWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (isInvalidWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // Case 1: second word is reverse of first
        if (isReverse(first, second)) {

            String reversed = new StringBuilder(first).reverse().toString().toLowerCase();
            String result = replaceVowels(reversed);
            System.out.println(result);

        } 
        // Case 2: not a reverse
        else {

            String combined = (first + second).toUpperCase();
            int vowels = 0, consonants = 0;

            for (char ch : combined.toCharArray()) {
                if ("AEIOU".indexOf(ch) != -1)
                    vowels++;
                else if (ch >= 'A' && ch <= 'Z')
                    consonants++;
            }

            if (vowels > consonants) {
                printFirstTwo(combined, true);
            } 
            else if (consonants > vowels) {
                printFirstTwo(combined, false);
            } 
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }

        sc.close();
    }

    // Print first two unique vowels or consonants
    private static void printFirstTwo(String str, boolean wantVowels) {
        Set<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            boolean isVowel = "AEIOU".indexOf(ch) != -1;

            if ((wantVowels && isVowel) || (!wantVowels && !isVowel && ch >= 'A' && ch <= 'Z')) {
                set.add(ch);
            }

            if (set.size() == 2)
                break;
        }

        StringBuilder result = new StringBuilder();
        for (char c : set)
            result.append(c);

        System.out.println(result.toString());
    }
}
