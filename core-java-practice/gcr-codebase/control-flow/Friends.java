import java.util.*;
class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aAge = sc.nextInt(), aHt = sc.nextInt();
        int bAge = sc.nextInt(), bHt = sc.nextInt();
        int cAge = sc.nextInt(), cHt = sc.nextInt();

        int youngest = Math.min(aAge, Math.min(bAge, cAge));
        int tallest = Math.max(aHt, Math.max(bHt, cHt));

        System.out.println("Youngest Age = " + youngest);
        System.out.println("Tallest Height = " + tallest);
        sc.close();
    }
}
