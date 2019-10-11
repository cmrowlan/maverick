package Java.Projects;

import java.util.Scanner;
public class Mav{
    public static String add = "add";
    public static String sub = "subtract";
    public static String mult = "multiply";
    public static String div = "divide";
    public static String mod = "modulus";
    public static String exit = "exit";
    public static void main(String[] args) {
        initial();
     }
    public static void initial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Mav Calculator" + '\n' + "Please enter your first number now: ");
        if (sc.hasNextInt()) {
            int q = sc.nextInt();
            menu(q);
        }
    }
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
                System.exit(0);
            }
        else {
            System.out.println("Please enter a valid input");
            initial(); 
        }
        
    }
    public static void doSub(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q - y;
        System.out.println("Your answer is: " + answer);
        initial();
    }
    public static void doMult(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q * y;
        System.out.println("Your answer is: " + answer);     
        initial();
    }
    public static void doDiv(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q / y;
        System.out.println("Your answer is: " + answer);     
        initial();
    }
    public static void doMod(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q % y;
        System.out.println("Your answer is: " + answer);     
        initial();
    }
    public static void doAdd(int q) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your second number now: ");
        int y = scan.nextInt();
        int answer = q + y;
        System.out.println("Your answer is: " + answer);     
        initial();
    }
        
    }


