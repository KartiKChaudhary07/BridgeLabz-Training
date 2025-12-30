import java.util.Random;

public class SnakeAndLadder {

    public static final int WIN_POSITION = 100;

    public static void main(String[] args) {

        int player1 = 0, player2 = 0;     // UC1: Game starts at position 0
        int diceCount = 0;
        boolean turnPlayer1 = true;       // True -> P1 turn, False -> P2 turn

        Random rand = new Random();

        while (player1 < WIN_POSITION && player2 < WIN_POSITION) {

            int dice = rand.nextInt(6) + 1;  // UC2: Dice value 1-6
            diceCount++;

            int option = rand.nextInt(3);    // UC3: 0-No Play, 1-Ladder, 2-Snake

            if (turnPlayer1) {
                System.out.println("\nPlayer 1 Turn");
                player1 = playGame(player1, dice, option);
                System.out.println("Player 1 Position → " + player1);

                if (option == 1) {     // ladder → extra chance
                    System.out.println("Ladder! Player 1 plays again 🪜");
                    continue;
                }
                turnPlayer1 = false;   // switch turn
            }
            else {
                System.out.println("\nPlayer 2 Turn");
                player2 = playGame(player2, dice, option);
                System.out.println("Player 2 Position → " + player2);

                if (option == 1) {     // ladder → extra chance
                    System.out.println("Ladder! Player 2 plays again 🪜");
                    continue;
                }
                turnPlayer1 = true;    // switch turn
            }
        }

        System.out.println("\n=============================");
        System.out.println("Total Dice Rolls → " + diceCount); // UC6
        if (player1 == WIN_POSITION)
            System.out.println("🏆 Player 1 WON the Game!");
        else
            System.out.println("🏆 Player 2 WON the Game!");
        System.out.println("=============================");
    }


    // Game logic method
    public static int playGame(int position, int dice, int option) {

        switch (option) {

            case 0:  // No play
                System.out.println("No Play ❌ | Dice: " + dice);
                break;

            case 1:  // Ladder
                System.out.println("Ladder 🪜 | Dice: " + dice);
                if (position + dice <= WIN_POSITION)
                    position += dice; // UC5 exact 100 rule
                break;

            case 2:  // Snake
                System.out.println("Snake 🐍 | Dice: " + dice);
                position -= dice;
                if (position < 0) position = 0; // UC4 restart if <0
                break;
        }
        return position;
    }
}