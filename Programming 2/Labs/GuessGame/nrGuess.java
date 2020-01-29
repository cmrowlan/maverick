package Labs.GuessGame;
import java.util.*;
public class nrGuess {
    public static void main(String[] args) {
        //print game rule
        System.out.println("Number Guessing Game:");
        System.out.println("---------------------");
        System.out.println("The random number is between 1 and 20");
        System.out.println("Enter your guess");
        System.out.println("See if your guess is too high or too low");
        System.out.println("Change your guess if needed");
        System.out.println("The computer will tell you how many guesses you tried");

        //while for invalid case
        int w1=0; //flag variable for while
        while (w1==0) {
            //menu (1 or 2, and invalid)
            System.out.println("Enter 1 for play or 2 for exit");
            Scanner sc = new Scanner(System.in);
            String option = sc.nextLine();
            //option1:play
            if (option.equals("1")){
                w1=999;
            }//if
            //option2:terminate
            if (option.equals("2")){
                System.exit(0);
            }//if
            else {
                System.out.println("Your input was invalid. Please enter a valid input");
            }//else

        }//while
           
        //random num generation
        Random rand = new Random();
        int r = rand.nextInt(21) + 1;
        int w2 = 0; //flag variable
        int attempt = 0; //attempt counter
        //while for valid gnr
        while (w2==0) {
            attempt++; //attempt counter
             //guess menu gnr or quit
             System.out.println("Enter your guess (or q to quit)");
             Scanner sc = new Scanner(System.in);
             String guess = sc.nextLine();
                //quit
                if (guess.equals("q")) {
                    System.out.println("It took you " + attempt + " attempt(s). The number was " + r);
                    System.exit(0);
                }//if
                //gnr
                    //gnr: str => int
                    int g = Integer.parseInt(guess);
                    //condition check [1, 20]
                    if (g>=1 && g<=20) {
                        //test r vs g
                        if (g == r) {
                            System.out.println("Bingo! It took you " + attempt + " attempts to get the number.");
                            w2 = 999;
                        }//if
                        if (g < r) {
                            System.out.println("Your guess number " + g + "  is too low.");
                        }//if
                        if (g > r) {
                            System.out.println("Your guess number " + g + "  is too high.");
                        }//if
                    }//if
                    else {
                        System.out.println("Invalid number. Please pick a number in the range [1, 20].");
                    }
                     
        }//while
        
    }//main

}//class