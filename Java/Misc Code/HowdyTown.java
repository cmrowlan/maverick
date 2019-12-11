import java.util.Scanner;
public class HowdyTown{
    public static void main (String [] args){
        System.out.println("Welcome to Howdy Town! Thanks for comin." + '\n'
        + "What would ya like to do?" + '\n' + "Have Fun or Be a butt?");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        System.out.println(ans);
    }
}