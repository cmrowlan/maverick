/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;
import java.io.*;

/**
 *
 * @author Chase
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Java Template 1
        System.out.println("Hello World!");
        
        //Java Template 2
        try{
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String line = r.readLine();
            System.out.println(line);
        }catch(IOException ioe) {
            System.err.println("Input Output Exception");
        }
        //
        try{
            String IN[] = new String[10];
            int cnt = 0;
            BufferedReader r = new BufferedReader(new FileReader("file1.txt"));
            while(true){
                String line = r.readLine();
                if(line == null){
                    break;
                }//fi
                IN[cnt] = line;
                System.out.println(IN[cnt]);
                cnt++;
            }//elihw
        }catch(IOException ioe){
            System.err.println("Input Output Exception");
            
        }//template 3
        
        
    }//main
    
}//class
