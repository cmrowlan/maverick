/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car_type1;

/**
 *
 * @author Chase
 */
public class Car_type1 {
    //field
    float mileage;
    
    
    //method
    void accelerate(){
        System.out.println("Car accelerated");
    }//acc
    
    public static void main(String[] args) {
        Car_type1 c1 = new Car_type1();
        c1.accelerate();
    }//main
    
}//class
