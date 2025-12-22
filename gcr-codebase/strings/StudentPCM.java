import java.util.Random;

class StudentPCM {

    static int[][] generateScores(int n) {
        Random r = new Random();
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                pcm[i][j] = 40 + r.nextInt(61);
        return pcm;
    }

    public static void main(String[] args) {
        int[][] pcm = generateScores(5);

        System.out.println("Phy Chem Math");
        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double percent = Math.round((total / 3.0) * 100) / 100.0;
            System.out.println(pcm[i][0] + "  " + pcm[i][1] + "  " + pcm[i][2] + "  " + percent);
        }
    }
}
