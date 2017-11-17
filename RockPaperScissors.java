import java.util.Scanner;
import java.util.Random;
/**
 * Write a description of class RockPaperScissors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RockPaperScissors
{
    static String user;  //user's input
    static String computer; //computer's input
    static int computerInt, userInt;
    static Scanner scan = new Scanner (System.in);
    static Random generator = new Random();
    public static void main(String[] args) {
        getUserInput();
        getComputerInput();
        determineWinner();
    }
    public static void getUserInput() {
        System.out.println("Rock, Paper, or Scissors? (1 for Rock, 2 for Paper, 3 for Scissors))");
        userInt = scan.nextInt();
    }
    public static void getComputerInput() {
        computerInt = generator.nextInt(3) + 1;
    }
    public static void determineWinner() {
        if (userInt == 1 && computerInt == 1) {
            System.out.println("Computer: Rock");
            System.out.println("User: Rock");
            System.out.println("Tie.");
        }
        else if (userInt == 1 && computerInt == 2) {
            System.out.println("Computer: Paper");
            System.out.println("User: Rock");
            System.out.println("Computer Wins.");
        }
        else if (userInt == 1 && computerInt == 3) {
            System.out.println("Computer: Scissors");
            System.out.println("User: Rock");
            System.out.println("You Win.");
        }
        else if (userInt == 2 && computerInt == 1) {
            System.out.println("Computer: Rock");
            System.out.println("User: Paper");
            System.out.println("You win.");
        }
        else if (userInt == 2 && computerInt == 2) {
            System.out.println("Computer: Paper");
            System.out.println("User: Paper");
            System.out.println("Tie.");
        }
        else if (userInt == 2 && computerInt == 3) {
            System.out.println("Computer: Scissors");
            System.out.println("User: Paper");
            System.out.println("Computer Wins.");
        }
        else if (userInt == 3 && computerInt == 1) {
            System.out.println("Computer: Rock");
            System.out.println("User: Scissors");
            System.out.println("Computer Wins.");
        }
        else if (userInt == 3 && computerInt == 2) {
            System.out.println("Computer: Paper");
            System.out.println("User: Scissors");
            System.out.println("You win.");
        }
        else if (userInt == 3 && computerInt == 3) {
            System.out.println("Computer: Scissors");
            System.out.println("User: Scissors");
            System.out.println("Tie.");
        }
    }
}
