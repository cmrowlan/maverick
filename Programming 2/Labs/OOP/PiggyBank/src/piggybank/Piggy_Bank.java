/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piggybank;

/**
 *
 * @author Chase
 */
public class Piggy_Bank {
    
    //field
    private int total;
    
    
    //method
    void deposit(int total){
        System.out.println("Current deposit is: " + total);
        this.total = this.total + total;
    }//deposit
    
    int getTotal(){
        return total;
        
    }//getTotal
    //constructor
    
    
    
}//class
