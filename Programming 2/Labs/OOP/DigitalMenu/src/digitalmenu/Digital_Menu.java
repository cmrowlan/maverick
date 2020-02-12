/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalmenu;

/**
 *
 * @author Chase
 */
public class Digital_Menu {
    
    //field
    private int quantity;
    private int menuPrice;
    
    
    //method
    public int foodPrice(){
        return menuPrice * quantity;
    }
    
    public void setMenuPrice(int x){
        this.menuPrice = x;
    }
    public void setQuantity(int x){
        this.quantity = x;
    }
    
    //constructor
    
    
    
}
