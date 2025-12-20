import java.util.Scanner;

class Friends {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int youngest = age[0];
        double tallest = height[0];
        String youngestName = names[0];
        String tallestName = names[0];

        for (int i = 1; i < 3; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
                youngestName = names[i];
            }

            if (height[i] > tallest) {
                tallest = height[i];
                tallestName = names[i];
            }
        }

        System.out.println("Youngest: " + youngestName);
        System.out.println("Tallest: " + tallestName);

        sc.close();
    }
}
