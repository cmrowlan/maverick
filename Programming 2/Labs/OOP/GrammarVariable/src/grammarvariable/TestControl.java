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
public class TestControl {
    public void getIII(){
     
        int score = 75;
        if (score>90){
            System.out.println("Grade is A");
        }
            else if (score>80){
                    System.out.println("Grade is B");
                    }
            else if (score>70){
                System.out.println("Grade is C");
            }
            else if (score >60){
                System.out.println("Grade is D");
                        }
            else {
                System.out.println("F");
        }
        int sw = 1;
        switch(sw){
            case 1: System.out.println("Mon"); break;
            case 2: System.out.println("Tue"); break;
            case 3: System.out.println("Wed"); break;
            case 4: System.out.println("Thu"); break;
            default: break;
        }
        
        out: for(int i = 0;i<3 ;i++){
            for(int j = 0;j<3;j++){
                if(j==1) break out;
            System.out.println("i: " + i + " j: " + j);
        }
    }
        System.out.println("Now out of nested for");
        
        out: for(int i = 0;i<2 ;i++){
            for(int j = 0;j<2;j++){
                if(j==1) continue;
            System.out.println("i: " + i + " j: " + j);
        }
    }
        int A[] = {1,2,3,4,5,6,7,8,9,10};
        
        int total=0;
        
        
        for(int asra$: A)
                total += asra$;
                System.out.println(total);
        
    }
    
}
