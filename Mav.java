import java.util.Scanner;

public class Mav{
    public static int q;
    public static int finalNum = 0;
    public static String add = "add";
    public static String sub = "subtract";
    public static String mult = "multiply";
    public static String div = "divide";
    public static String mod = "modulus";
    public static String exit = "exit";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Welcome message and first number entry
        System.out.println("Welcome to the Mav Calculator" + '\n' + "Please enter your first number now: ");
        int q = scan.nextInt();

        // Action menu seen here
        System.out.println("ADD +" + '\n' + "SUBTRACT - " + '\n' + "MUTLIPLY * " + '\n' + "DIVIDE / " + '\n'
                + "MODULUS % " + '\n' + "EXIT e" + '\n' + "Please enter your desired operation: ");
            readIn(q);
    }
        // Read in action here
    public static void readIn(int q){
        int x = 1;
        Scanner scan = new Scanner(System.in);
        String act = scan.next();
    first:
        do { 
       if (act.equalsIgnoreCase(add))
                 doAdd(q);
        if (act.equalsIgnoreCase(sub))
                doSub(q);
        if (act.equalsIgnoreCase(mult))
                doMult(q);
        if (act.equalsIgnoreCase(div))
                doDiv(q);
        if (act.equalsIgnoreCase(mod))
                doMod(q);
        if (act.equalsIgnoreCase(exit)){
                System.out.println("Thanks for using the Mav Calculator!");
                System.exit(0);
            }
        else {
            System.out.println("Please enter a valid input");
            x++;
            readIn(0); 
        } 
        
        while (x<15) {
            System.out.println("hi");
        }
     }
    public static void doSub(int x) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q - y;
    }
    public static void doMult(int x) {
        
    }
    public static void doDiv(int x) {
        
    }
    public static void doMod(int x) {
        
    }
    public static void doAdd(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q + y;
        System.out.println(answer);

        
    
        
    }
}

