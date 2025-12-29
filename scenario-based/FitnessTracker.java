public class FitnessTracker {
    public static void main(String[] args) {
        int[] pushUps = {30, 0, 40, 50, 0, 60, 70};
        int total = 0, days = 0;
        for (int p : pushUps) {
            if (p == 0) continue;
            total += p;
            days++;
        }
        double average = (double) total / days;
        System.out.println("Total Push-ups: " + total);
        System.out.println("Average Push-ups: " + average);
    }
}
