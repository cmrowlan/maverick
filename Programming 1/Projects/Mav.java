package Java.Projects;

import java.util.Scanner;
public class Mav{
    //Comparison strings are initialized here
    public static String asymbol = "+";
    public static String ssymbol = "-";
    public static String msymbol = "*";
    public static String mosymbol = "%";
    public static String dsymbol = "/";
    public static String esymbol = "e";
    public static String add = "add";
    public static String sub = "subtract";
    public static String mult = "multiply";
    public static String div = "divide";
    public static String mod = "modulus";
    public static String exit = "exit";
    public static void main(String[] args) {
        initial();
     }
     //Welcomes the user, proceeds to read in a variable which then leads into the menu
    public static void initial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Mav Calculator" + '\n' + "Please enter your first number now: ");
        if (sc.hasNextInt()) {
            int q = sc.nextInt();
            menu(q);
        }
    }
    //Menu is seen here, user can choose from available options. The system then calls on the appropriate function to continue
    public static void menu(int q) {
        System.out.println("MENU:" + '\n' + "ADD +" + '\n' + "SUBTRACT - " + '\n' + "MUTLIPLY * " + '\n' + "DIVIDE / " + '\n'
        + "MODULUS % " + '\n' + "EXIT e" + '\n' + "Please enter your desired operation: ");
        Scanner sc = new Scanner(System.in);
        String act = sc.next();
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
                System.exit(0);}
        if (act.equalsIgnoreCase(asymbol))
                doAdd(q);
       if (act.equalsIgnoreCase(ssymbol))
               doSub(q);
       if (act.equalsIgnoreCase(msymbol))
               doMult(q);
       if (act.equalsIgnoreCase(dsymbol))
               doDiv(q);
       if (act.equalsIgnoreCase(mosymbol))
               doMod(q);
       if (act.equalsIgnoreCase(esymbol)){
               System.out.println("Thanks for using the Mav Calculator!");
               System.exit(0);}
        else {
            System.out.println("Please enter a valid input");
            initial();}
    }
        //Subtraction function is done here when called on
    public static void doSub(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q - y;
        System.out.println("Your answer is: " + answer);
        initial();
    }
        //Multiplication function is done here when called on
    public static void doMult(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q * y;
        System.out.println("Your answer is: " + answer);     
        initial();
    }
    //Division function is done here when called on
    public static void doDiv(int q) {
        try{ Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q / y;
        System.out.println("Your answer is: " + answer);}
        catch(ArithmeticException x){
            System.out.println("You cannot divide by zero!");
        }     
        finally{ initial();
        }
    }
        //Modulus function is done here when called on
    public static void doMod(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q % y;
        System.out.println("Your answer is: " + answer);     
        initial();
    }
        //Addition function is done here when called on
    public static void doAdd(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q + y;
        System.out.println("Your answer is: " + answer);     
        initial();
    }
        
    }


