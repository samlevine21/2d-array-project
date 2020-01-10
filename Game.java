import java.util.Scanner;
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    private static final String QUIT = "Q";
    private static boolean modeSelected = false;
    public static int gameType = -1;
    public static String word = "";
    // 0 is Normal, 1 is Hard, 2 is 2 player
    public static void modeSelect() {
        String response = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter PLAY or HARDMODE to start playing against the computer.");
            System.out.println("Enter 2P to play against another person.");
            System.out.println("Enter " + QUIT + " to quit.");
            response = in.nextLine();
            response = response.toUpperCase();
            if ("PLAY".equals(response)) {
                //normal mode
                System.out.println("Normal Difficulty Selected");
                gameType = 0;
                modeSelected = true;
            }
            if ("HARDMODE".equals(response)) {
                //hard mode
                System.out.println("Hard Difficulty Selected");
                gameType = 1;
                modeSelected = true;
            }
            if ("2P".equals(response)) {
                System.out.println("Two Player Mode Selected");
                gameType = 2;
                modeSelected = true;
            }
        }
        while (!QUIT.equals(response) && modeSelected == false);
    }

    public static void userWordInput() {
        if (gameType == 2) {
            String response = "";
            Scanner in = new Scanner(System.in);
            do {
                System.out.print("Type in any word (at least 3 letters)");
                System.out.println(" and make sure they can't see it!");
                response = in.nextLine();
                response = response.toUpperCase();
            }
            while (response.length()<3);
            Main.answer = response;
        }
    }

}
