import java.util.*;
class CreatorStats {

    private String creatorName;
    private double[] weeklyLikes;

    public static List<CreatorStats> EngagementBoard = new ArrayList<>();

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public double[] getWeeklyLikes() {
        return weeklyLikes;
    }

    public void setWeeklyLikes(double[] weeklyLikes) {
        this.weeklyLikes = weeklyLikes;
    }
}
public class Program {

    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

    public Map<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {

        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats creator : records) {
            int count = 0;

            for (double likes : creator.getWeeklyLikes()) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }

            if (count > 0) {
                result.put(creator.getCreatorName(), count);
            }
        }

        return result;
    }

    public double CalculateAverageLikes() {

        double total = 0;
        int count = 0;

        for (CreatorStats creator : CreatorStats.EngagementBoard) {
            for (double likes : creator.getWeeklyLikes()) {
                total += likes;
                count++;
            }
        }

        return count == 0 ? 0 : total / count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Program program = new Program();
        boolean running = true;

        while (running) {

            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("\nEnter your choice:");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    CreatorStats creator = new CreatorStats();

                    System.out.println("Enter Creator Name:");
                    creator.setCreatorName(sc.nextLine());

                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");

                    for (int i = 0; i < 4; i++) {
                        likes[i] = Double.parseDouble(sc.nextLine());
                    }

                    creator.setWeeklyLikes(likes);
                    program.RegisterCreator(creator);

                    System.out.println("Creator registered successfully\n");
                    break;

                case 2:
                    System.out.println("Enter like threshold:");
                    double threshold = Double.parseDouble(sc.nextLine());

                    Map<String, Integer> result =
                            program.GetTopPostCounts(CreatorStats.EngagementBoard, threshold);

                    if (result.isEmpty()) {
                        System.out.println("No top-performing posts this week\n");
                    } else {
                        for (Map.Entry<String, Integer> entry : result.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    double avg = program.CalculateAverageLikes();
                    System.out.println("Overall average weekly likes: " + avg + "\n");
                    break;

                case 4:
                    System.out.println("\nLogging off - Keep Creating with StreamBuzz!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice\n");
            }
        }

        sc.close();
    }
}
