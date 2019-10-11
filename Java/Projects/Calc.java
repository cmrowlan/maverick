package Java.Projects;

import java.util.Scanner;


public class Calc{
    public static void main(String[] args) {
      //Scanner is set up
        Scanner scan = new Scanner(System.in);
       //User sees "UI"
        System.out.println("Welcome to the Maverick Calculator");
       System.out.println("Please enter your first number:");
       int number1 = scan.nextInt();
       System.out.println("Please enter your second number:");
       int number2 = scan.nextInt();
      //System begins calculations process
      
       int sumNumber = number1 + number2;
       int difNumber = number1 - number2;
       int multNumber = number1 * number2;
       int divNumber = number1 / number2;
       int modNumber = number1 % number2;
       int squNumber = number1 * number1;
       int sqrtNumber = number2 * number2;
       int mavNumber = number2 * number1 + 2 + 9 + 5 *13;
       
       //System completes calculations and presents answers in readable answers to user

       System.out.println("ADD: " + number1 + " + " + number2 + " = " + sumNumber);
       System.out.println("SUBTRACT: " + number1 + " - " + number2 + " = " + difNumber);
       System.out.println("MULTIPLY: " + number1 + " * " + number2 + " = " + multNumber);
       System.out.println("DIVIDE: " + number1 + " / " + number2 + " = " + divNumber);
       System.out.println("MODULUS: " + number1 + " % " + number2 + " = " + modNumber);
       System.out.println("FIRST NUMBER SQUARED: " + number1 + " ^ 2 " + " = " + squNumber);
       System.out.println("SECOND NUMBER SQUARED: " + number2 + " ^ 2" + " = " + sqrtNumber);
       System.out.println("MAVERICK'S EQUATION: " + number2 + " * " + number1 + " + 2 + 9 + 5 * 13 = " + mavNumber);

       //Done with math now exit message

       System.out.println("Thanks for using the Maverick Calculator! Good Day!");

        
     
        
    }

}