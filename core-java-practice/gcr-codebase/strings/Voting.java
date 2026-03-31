import java.util.Random;

class Voting {

    static int[] generateAges(int n) {
        Random r = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = r.nextInt(90);
        return ages;
    }

    static String[][] checkVote(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "true" : "false";
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] table = checkVote(generateAges(10));

        System.out.println("Age\tCanVote");
        for (int i = 0; i < table.length; i++)
            System.out.println(table[i][0] + "\t" + table[i][1]);
    }
}
