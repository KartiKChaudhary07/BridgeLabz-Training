import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physicsMarks = scanner.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistryMarks = scanner.nextInt();

        System.out.print("Enter Maths marks: ");
        int mathsMarks = scanner.nextInt();

        int totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double averageMarks = totalMarks / 3.0;

        char grade;
        String remarks;

        if (averageMarks >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } else if (averageMarks >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } else if (averageMarks >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } else if (averageMarks >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } else if (averageMarks >= 40) {
            grade = 'E';
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("\nAverage Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        scanner.close();
    }
}