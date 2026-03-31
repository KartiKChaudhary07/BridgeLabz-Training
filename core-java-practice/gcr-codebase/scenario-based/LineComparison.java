import java.util.Scanner;
public class LineComparison {
    public static Double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to Line Comparison Computation Program!\n");
        System.out.println("Enter coordinates for Line 1:");
        System.out.print("x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        Double line1 = calculateLength(x1, y1, x2, y2);
        System.out.println("Length of Line 1 = " + line1);
        System.out.println("\nEnter coordinates for Line 2:");
        System.out.print("x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();
        System.out.print("x4 y4: ");
        int x4 = sc.nextInt(), y4 = sc.nextInt();

        Double line2 = calculateLength(x3, y3, x4, y4);
        System.out.println("Length of Line 2 = " + line2);

        if(line1.equals(line2))
            System.out.println("\nUC2 -> Both lines are Equal in Length");
        else
            System.out.println("\nUC2 -> Lines are NOT Equal");
        int compare = line1.compareTo(line2);

        if(compare == 0)
            System.out.println("UC3 -> Both lines are Equal");
        else if(compare > 0)
            System.out.println("UC3 -> Line 1 is Greater than Line 2");
        else
            System.out.println("UC3 -> Line 1 is Smaller than Line 2");
        sc.close();
    }
}