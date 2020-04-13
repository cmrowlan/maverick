/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Chase
 */
public class Calc {
    //f
    private int firstOperand;
    private int secondOperand;
    private char operator;
    
    //m
    public int calculate(){
        int result = 0;
        switch(operator){
            case '+': result = firstOperand + secondOperand; break;
            case '-': result = firstOperand - secondOperand; break;
            case '*': result = firstOperand * secondOperand; break;
            case '/': result = firstOperand / secondOperand; break;
            default: System.out.println("NA"); break;
        }//switch
        return result;
    }//calc
    
    
    //c
   Calc(int firstOperand, int secondOperand, char operator){
       this.firstOperand = firstOperand;
       this.secondOperand = secondOperand;
       this.operator = operator;
       
   }//constr
}//class
