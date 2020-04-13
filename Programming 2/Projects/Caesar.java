package Projects;

import java.util.*;
public class Caesar{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your string you wanted encrypted: ");
        String userInput = sc.nextLine();
        System.out.println("Enter key to encrypt by: ");
        int encryptKey = sc.nextInt();
        System.out.println("Your encrypted string is: " + encryptString(userInput, encryptKey));
    }

    private static String encryptString(String userInp, int key) {
        String encInput = "";
        int length = userInp.length();
        for (int i = 0; i< length ; i++){
        char a = (char)(userInp.charAt(i));
        if (a == ' ')
            encInput += " ";
        else if (a > 'z')
            encInput += (char)(userInp.charAt(i) - (26-key));
        else
            encInput += (char)(userInp.charAt(i) + key);
    }
        return encInput;
    }
}