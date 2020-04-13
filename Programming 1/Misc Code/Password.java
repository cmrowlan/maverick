import java.util.Scanner;
public class Password{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] passArray = new String[4];
        passArray[0] = "Password";
        passArray[1] = "pass123";
        passArray[2] = "howdy";
        passArray[3] = "p@ssword";
        System.out.println("Please enter your password now");
        String entry = sc.nextLine();
        if (entry.equals(passArray[0]))
            System.out.println("PASSWORD IS VALID");
        else if (entry.equals(passArray[1]))
            System.out.println("PASSWORD IS VALID"); 
        else if (entry.equals(passArray[2]))
            System.out.println("PASSWORD IS VALID");
        else if (entry.equals(passArray[3]))
            System.out.println("PASSWORD IS VALID");
        else
            System.out.println("PASSWORD IS INVALID");
    }
}
