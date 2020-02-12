/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piggybank;


// @author Chase
 
public class PiggyBank {

    public static void main(String[] args) {
        
        
        Piggy_Bank pb1 = new Piggy_Bank();
        pb1.deposit(20);
        pb1.deposit(100);
        
        
        System.out.println("Your current balance is: " +pb1.getTotal());
    }//main
    
}//class
