import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
/**
 * Write a description of class WordSelector here.
 *
 * @author (Sam Levine)
 * @version (1/9/20)
 */
public class WordSelector
{
    public static ArrayList<String> words = new ArrayList<String>();
    public static String randomWord = "";

    public static void clearArray() {
        words.clear();
    }

    private static void readWords() {
        Scanner myScannerInput;
        if (Game.gameType == 0) {
            try {
                myScannerInput = new Scanner(new File("words.txt"));
            }
            catch (java.io.FileNotFoundException e) {
                System.out.println("FileNotFoundException: " + e.getMessage());
                return;
            }
        }
        else {
            try {
                myScannerInput = new Scanner(new File("hardwords.txt"));
            }
            catch (java.io.FileNotFoundException e) {
                System.out.println("FileNotFoundException: " + e.getMessage());
                return;
            }
        }
        while (myScannerInput.hasNextLine()) {
            String line = myScannerInput.nextLine();
            words.add(line);
        }
    }

    public static String selectWord() {
        readWords();
        int index = (int) (Math.random()*(words.size()));
        return words.get(index);
    }
}
