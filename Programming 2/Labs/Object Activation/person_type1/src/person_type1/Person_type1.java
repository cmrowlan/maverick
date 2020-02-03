/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person_type1;

/**
 *
 * @author Chase
 */
public class Person_type1 {

    //field
    String name;
    String gender;
    String dob;
    
    
    
    //method
    void write(){
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name[] = new String[3];
        
        Person_type1 p1 = new Person_type1();
        p1.name = "Abram";
        name[0] = p1.name;
        
        
        Person_type1 p2 = new Person_type1();
        p2.name = "Bob";
        name[1] = p2.name;
        
        
        Person_type1 p3 = new Person_type1();
        p3.name = "Cindy";
        name[2] = p3.name;
        
        
        for (int i = 0; i < 3; i++)
        System.out.println("Your name is: " + name[i]);
    }
    
}
