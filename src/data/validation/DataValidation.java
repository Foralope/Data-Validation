/*
 * William Zwart
 * 28/11/18
 * This program will validate data (hopefully)
 */

package data.validation;
import java.util.regex.Pattern;
import javax.swing.*;
/**
 *
 * @author wizwa9381
 */
public class DataValidation {
    /**
     * Method to validate data in a string.
     * @param needsAn_a The string that gets tested for if it contains a lowercase 'a'.
     * @param input The string that takes in input.
     */
    public static void containsAn_a (String needsAn_a, String input) {
        //Need an 'a' to continue
        input = JOptionPane.showInputDialog("Enter a string that contains a lowercase 'a'");
        needsAn_a = input;
        while (Pattern.compile("[a]").matcher(needsAn_a).find() == false){
            System.err.println("Your string contains no 'a'. Please enter a string with an 'a'.");
            input = JOptionPane.showInputDialog("Enter a string that contains a lowercase 'a'");
            needsAn_a = input;
        }
    }
    /**
     * Method to validate data in a string.
     * @param greaterThanSix The string that must be tested for valid data.
     * @param input The string to take in user input.
     */
    public static void stringBiggerThanSix (String greaterThanSix, String input) {
        //Doesn't let you leave until you enter valid data (no numbers and longer than six characters)
        input = JOptionPane.showInputDialog("Using letters only, enter a word that is longer than 6 letters without numbers.");
        greaterThanSix = input;
        while (greaterThanSix.length() <= 6 || Pattern.compile("[0-9]").matcher(greaterThanSix).find() == true){
            if (greaterThanSix.length() <= 6) {
                System.err.println("Your word is not long enough.");
            }
            if (Pattern.compile("[0-9]").matcher(greaterThanSix).find() == true) {
                System.err.println("Your word contains numbers. Please input a word without numbers.");
            }
            input = JOptionPane.showInputDialog("Using letters only, enter a word that is longer than 6 letters without numbers.");
            greaterThanSix = input;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int positive,negative,betweenTwoNumbers,inputInteger;
        String greaterThanSix = null,needsAn_a = null,betweenFiveAndFifteen,input = null;
        //Methods
        stringBiggerThanSix(greaterThanSix,input);
        
        containsAn_a(needsAn_a,input);
        
        input = JOptionPane.showInputDialog("Enter a string between 5 and 15 characters long that doesn't contain a 'Z'.");
        betweenFiveAndFifteen = input;
        while (betweenFiveAndFifteen.length() < 5 || betweenFiveAndFifteen.length() > 15 || Pattern.compile("[Z]").matcher(greaterThanSix).find() == true){
            if (betweenFiveAndFifteen.length() < 5){
                System.err.println("Your string is too short.");
            }
            if (betweenFiveAndFifteen.length() > 15){
                System.err.println("Your string is too long.");
            }
            if (Pattern.compile("[Z]").matcher(greaterThanSix).find() == true){
                System.err.println("Your string contains the letter 'Z'. Please remove it.");
            }
            input = JOptionPane.showInputDialog("Enter a string between 5 and 15 characters long that doesn't contain a 'Z'.");
            betweenFiveAndFifteen = input;
        }
    }
    
}
