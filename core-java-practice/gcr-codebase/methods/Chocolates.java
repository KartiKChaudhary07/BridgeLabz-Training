import java.util.Scanner;

class Chocolates {

    static int[] distribute(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = distribute(chocolates, children);
        System.out.println("Each child gets = " + res[0]);
        System.out.println("Remaining chocolates = " + res[1]);
        sc.close();
    }
}
