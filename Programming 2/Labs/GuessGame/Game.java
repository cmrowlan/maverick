package Labs.GuessGame;
import java.util.*;

public class Game {
    public static int numGuesses;
    public static void main(String[] args) {
        rules();
    }
    public static void rules() {
        System.out.println("Number Guessing Game:");
        System.out.println("---------------------");
        System.out.println("The random number is between 1 and 20");
        System.out.println("Enter your guess");
        System.out.println("See if your guess is too high or too low");
        System.out.println("Change your guess if needed");
        System.out.println("The computer will tell you how many guesses you tried");
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for play or 2 for exit");
        try {
            int answer = sc.nextInt();
            if (answer == 1) {
                guess();
            } else {
                System.exit(1);
            }
        } catch (Exception intCatch) {
            System.out.println("Invalid input please try again");}
    }
    public static void guess() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(21 + 1);
        Scanner sc = new Scanner(System.in);
        for(int x = 0; x < 100; x++) {
        System.out.println("Enter your guess (or q to quit)");
            while (sc.hasNext()) {
                if (sc.hasNextInt()) {
                        int userGuess = sc.nextInt();
                        if (userGuess == randomNumber) {
                            System.out.println("Bingo! It took you " + numGuesses + " attempt(s) to guess this number.");
                            System.exit(1);
                        }
                        if (userGuess < randomNumber) {
                            System.out.println("Your guess number " + userGuess + " is too low.");
                            numGuesses++;
                        } 
                        if (userGuess > randomNumber){
                            System.out.println("Your guess number " + userGuess + "  is too high.");
                            numGuesses++;
                        }
                        else {
                            System.exit(1);
                        }
                        
                } else {
                    System.exit(1);
                }
            }
           
            
        }
}
    }