package Java.Projects;

import java.util.*;
public class Game {
    static int total = 0;
    public static void main(String[] args) {
        Random rand = new Random();
        int userNum = doScan(0);
        int randInt = rand.nextInt(100) +1;
        int difference = getDifference(randInt, userNum);
        int points = doPoints(difference);
        int score = doScore(difference);
        System.out.println("You chose: " + userNum + '\n' +
        "The number was: " + randInt + '\n' + "The difference was: " + difference + '\n' +
        "You recieved " + points + " points" + '\n' + "Your score is: " + total);
        doEnd(0);
    }
    
    public static int doScan(int x) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100:");
        while(!scan.hasNextInt()) {
            scan.next();
        }
        int input = scan.nextInt();
    
        return input;    
    }
    public static void doEnd(int x) {
       while (x<1000) {
        System.out.println("Do you want to play again?");
        Scanner scan = new Scanner(System.in);
        String response = scan.next();
        String yes = "yes";
        String no = "no";
        if (yes.equalsIgnoreCase(response))
            main(null);
        else if (no.equalsIgnoreCase(response))
            System.exit(0);
        else 
            System.out.println("Please enter either Yes or No");
        x++;}
    }

    public static int doScore(int x) {
        int y = 0;
        if (x > 25) {    
            y = 10;
        } else if (x < 25 && x > 0) {
            y = 50;
        } else if (x <= 0) {
            y = 100;
        }
        increaseScore(y);
        return y;
    }
  
    public static void increaseScore(int x) {
        total += x;
    }
    public static int doPoints(int x) {
        int y = 0;
        if (x > 25) {    
            y = 10;
        } else if (x < 25 && x > 0) {
            y = 50;
        } else if (x <= 0) {
            y = 100;
        }
        return y;

    }
    public static int getDifference(int x, int y) {
        int z = x - y;
        int finDifference = Math.abs(z);
        return finDifference;
        
    }
}

    