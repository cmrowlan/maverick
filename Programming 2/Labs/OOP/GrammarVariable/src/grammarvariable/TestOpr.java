/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grammarvariable;

/**
 *
 * @author Chase
 */
public class TestOpr {
    
    // 1. Assignment =
    
    public void getII(){
        System.out.println("Operator ex: ");
        
        
        int as = 5;
        System.out.println("as: " + as);
        
        // 2. arithmetic: + - * / %
        int mo = -3%2;
        System.out.println("mo: "+ mo);
        
        // 3. Bitwise & | ^ ~ << >>
        int bt1 = 2 & 3; //10 and 11 -> 10
        System.out.println("bt1: " + bt1);
        int bt2 = ~3;
        System.out.println("bt2: " + bt2);
        int bt3 = 8 >> 2;
        System.out.println("bt3: " + bt3);
        
        // 4. Comparative: == < > <= >=
        
        // 5. Conditional: && || :?
        int con = 3<2?1:0;  //ternary operator
        System.out.println("con: " + con);
        
        
        // 6. increment/decrement
        int inc1 = 7;
        int inc2 = ++inc1;
        System.out.println("inc1: " + inc1 + " inc2: " + inc2);
        
        // 7. Logic
        
        
    }//gII
    
}//TO
