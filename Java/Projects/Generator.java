import java.util.*;

public class Generator {
    public static void main(String[] args) {
        Random rand = new Random();
       
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 100:");

        int userNum = scan.nextInt();

        int rand_int1 = rand.nextInt(100) + 1;

        int finalNum = userNum - rand_int1;

        int finalNum1 = Math.abs(finalNum);

        int score  //enter code here

        System.out.println("You picked: " + userNum + '\n' + "The number was: "
         + rand_int1 + '\n' + "The difference was: "  + finalNum1 + '\n' + "Your score: " );
    
        }
        
    }


