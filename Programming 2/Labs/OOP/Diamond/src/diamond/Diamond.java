/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamond;

/**
 *
 * @author Chase
 */
public class Diamond {

    /**
     * @param args the command line arguments
     */
    
    //top
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++){
            for(int j = 0; j <=5; j++){
                if(4-1<=j && j<=2+i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }//else
            }
        }
        System.out.println("");
        
        //bottom
        for(int i = 1; i<=2; i++){
            for(int j=1; j<=5; j++){
                if (2+i<=j && j<=6-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                            }
                System.out.println("");
                
    
    
            }
}
    }
}