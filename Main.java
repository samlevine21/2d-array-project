/**
 * Write a description of class testing here.
 *
 * @author (Sam)
 * @version (1/9/20)
 */
public class Main
{
    public static String answer = "";
    public static void main(String[] args){
        WordSelector.clearArray();
        Game.modeSelect();
        answer = WordSelector.selectWord();
        Game.userWordInput();
        clearTerminal();
    }
    
    private static void clearTerminal(){
        System.out.print('\u000C');
    }
}

//What is done:
//Initial gamemode selection and word generation/input
//TODO:
//Guessing methods (for individual letters or full words)
//Displays
//      Letters Remaining
//      Letters Used
//      Hangman!