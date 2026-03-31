import java.util.Scanner;

class RPS {

    static String computerChoice() {
        String[] c = {"rock", "paper", "scissors"};
        return c[(int)(Math.random() * 3)];
    }

    static String winner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock") && comp.equals("scissors") ||
            user.equals("paper") && comp.equals("rock") ||
            user.equals("scissors") && comp.equals("paper"))
            return "User";
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWin = 0, compWin = 0;

        System.out.print("Enter games: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("rock/paper/scissors: ");
            String user = sc.next();
            String comp = computerChoice();
            String win = winner(user, comp);

            if (win.equals("User")) userWin++;
            else if (win.equals("Computer")) compWin++;
        }

        System.out.println("User wins: " + userWin);
        System.out.println("Computer wins: " + compWin);
        sc.close();
    }
}
