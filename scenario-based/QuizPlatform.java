import java.util.*;
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

class QuizPlatform {

    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length)
            throw new InvalidQuizSubmissionException("Answers length mismatch");

        int score = 0;
        for (int i = 0; i < correct.length; i++)
            if (correct[i].equalsIgnoreCase(user[i]))
                score++;

        return score;
    }

    static String grade(int score) {
        if (score >= 8) return "A";
        if (score >= 5) return "B";
        return "C";
    }

    public static void main(String[] args) throws Exception {
        String[] correct = {"A", "B", "C", "D", "A"};
        String[] user = {"A", "B", "C", "A", "A"};

        List<Integer> scores = new ArrayList<>();

        int score = calculateScore(correct, user);
        scores.add(score);

        System.out.println("Score: " + score);
        System.out.println("Grade: " + grade(score));
        System.out.println("All Scores: " + scores);
    }
}
