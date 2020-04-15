package com.company;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Chase
 */
public class Front extends JFrame implements ActionListener, TextListener{
    //field
    TextField tfm1 = new TextField(20);
    TextField tfm2 = new TextField(20);
    Button bm = new Button("Login");
    //method



    
    
    //c
    Front(){
        //container
        JFrame f = new JFrame("Login Page");
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
        lt.setForeground(Color.BLUE);
        f.add(lt);
        
            //middle
        Label lm1 = new Label("ID: ", Label.CENTER);
        lm1.setFont(font2);
        lm1.setForeground(Color.GREEN);
        tfm1.addTextListener(this);
        
        Label lm2 = new Label("Password: ", Label.CENTER);
        lm2.setFont(font2);
        lm2.setForeground(Color.GREEN);
        tfm2.addTextListener(this);
        tfm2.setEchoChar('*');
        bm.addActionListener(this);

        
        //panel
        
            //bottom
        Label lb = new Label("ocu.edu", Label.CENTER);
        lb.setFont(font2);
        lb.setForeground(Color.BLUE);

        Panel pm = new Panel();
        pm.add(lm1); pm.add(tfm1); pm.add(lm2); pm.add(tfm2); pm.add(bm);
          f.add(pm);  f.add(lb);
                  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //validation
        if(tfm1.getText().equals("oop") && tfm2.getText().equals("1614")){
            new OptionMenu();
        }//fi
        //go to menu page
        else{
            new Front();
        }//esle


    }//aP

    @Override
    public void textValueChanged(TextEvent e) {

    }//tVC
}
