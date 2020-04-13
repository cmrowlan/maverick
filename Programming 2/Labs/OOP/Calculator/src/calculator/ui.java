package calculator;

import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chase
 */
public class ui {
    //f
    Scanner sc = new Scanner(System.in);
    
    
    
    //m
    public void showMenu(){
        System.out.print("Please enter your first operand: ");
        int firstOperand = sc.nextInt();
        System.out.print("Please enter your second operand: ");
        int secondOperand = sc.nextInt();
        System.out.print("Please enter your operator: ");
        char operator = sc.next().charAt(0);
        Calc c1 = new Calc(firstOperand, secondOperand, operator);
        int result = c1.calculate();
        System.out.println("Your result is: " + result);
    }//menu
    
    
    
    //c
    
}//class
