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
public class TestVar {
    //f
    Employee emp = new Employee();  //instance variable = non static field var
    String str; 
    int i;                          //class variable = static field variable
    
    //m
    void getI(int j){               //parameter variable
        int k=0;                      //local variable
        System.out.println(k);
        
        //identifier all alphabet, number(s) and special char (_, $), not starting by number
        int I;
        int i1;
        int i$;
        
        //range for byte (-128 , 127)
        byte b2 = 126;
        
        //range for int 
        
        
        //default: byte, short, int, long, float, double, char, boolean
        long l2 = 0;
        System.out.println(l2);
        float f2 = 0.0f;
        System.out.println(f2);
        double d2 = 0.0d;
        System.out.println(d2);
        
        char c2 = '\u0000';
        System.out.println(c2);
        boolean b3 = false;
        System.out.println(b3);
        
        //usage
        int ii = 0xa;  //hexadecimal = 0xa  decimal = 10
        System.out.println("ii = " + ii);
        
        
        //String
        String str1 = "abc";
        
        char data[] = {'a' , 'b' , 'c'};
        String str2 = new String(data);
        
        System.out.println("str1: " + str1 + " vs " + "str2: " + str2);
    }//gI
    
    
    //c
}//class
