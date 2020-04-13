/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphic_ex;


import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Chase
 */
public class Front extends JFrame{
    //field
    
    
    //method
    
    
    
    //c
    Front(){
        //container
        JFrame f = new JFrame("front");
        f.setBounds(10, 10, 600, 400);
        //layout
        GridLayout gl = new GridLayout(3, 1);
        f.setLayout(gl);
        
        //component
        Font font1 = new Font("Times New Romans", Font.BOLD, 24);
        Font font2 = new Font("Times New Romans", Font.BOLD, 12);
        
        
            //top
        Label lt = new Label("Employee Management System", Label.CENTER);
        lt.setFont(font1);
        lt.setForeground(Color.blue);
        f.add(lt);
        
            //middle
        Label lm1 = new Label("ID: ", Label.CENTER);
        lt.setFont(font2);
        lt.setForeground(Color.green);
        TextField tfm1 = new TextField(20);
        Panel pm = new Panel();
        
        Label lm2 = new Label("Password: ", Label.CENTER);
        lt.setFont(font2); 
        lt.setForeground(Color.green);
        TextField tfm2 = new TextField(20);
        tfm2.setEchoChar('*');
        
        Button bm = new Button("Login");
        
        //panel
        
            //bottom
        Label lb = new Label("ocu.edu", Label.CENTER);
        lb.setFont(font2);
        lb.setForeground(Color.BLUE);
        
        pm.add(lm1); pm.add(tfm1); pm.add(lm2); pm.add(tfm2); pm.add(bm);
          f.add(pm);  f.add(lb);
                  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }
}
