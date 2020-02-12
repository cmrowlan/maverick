/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalmenu;
import java.util.*;
/**
 *
 * @author Chase
 */
public class ui {
    Scanner sc = new Scanner(System.in);
    
    //field
    
    
    
    //method
    void showMenu(){
        System.out.print("menuPrice: ");
        int menuPrice = sc.nextInt();
        
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();
         
        Digital_Menu dm1 = new Digital_Menu();
        dm1.setMenuPrice(menuPrice);
        dm1.setQuantity(quantity);
        
        //call FoodPrice()
        System.out.println("Food Price is: " +dm1.foodPrice());
    }
}
