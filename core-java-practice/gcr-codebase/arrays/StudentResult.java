import java.util.Scanner;

class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks
        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextDouble();
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3;

            if (percentage[i] >= 75) {
                grade[i] = 'A';
            } else if (percentage[i] >= 60) {
                grade[i] = 'B';
            } else if (percentage[i] >= 50) {
                grade[i] = 'C';
            } else {
                grade[i] = 'F';
            }
        }

        // Display result
        System.out.println("\n--- Student Result ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("----------------------");
        }

        sc.close();
    }
}
