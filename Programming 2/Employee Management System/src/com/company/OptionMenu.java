package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Chase
 */
public class OptionMenu extends JFrame{
    //field


    //method
    void actionPerformed(ActionEvent ae){

    }


    //c
    OptionMenu(){
        //container
        JFrame f = new JFrame("Menu");
        f.setBounds(10, 10, 600, 400);

        //layout
        GridLayout gl = new GridLayout(3, 1);
        f.setLayout(gl);
        
        //component
        Font font1 = new Font("Times New Romans", Font.BOLD, 24);
        Font font2 = new Font("Times New Romans", Font.BOLD, 12);
        
        
            //top
        Label lt = new Label("Employee Management System: Menu", Label.CENTER);
        lt.setFont(font1);
        lt.setForeground(Color.BLUE);
        f.add(lt);
        
            //middle
        Label lm = new Label("Select your option: ");
        Choice cm = new Choice();
        cm.add("Register");
        cm.add("Search");
        cm.add("List All");
        cm.add("Count");
        cm.add("Exit");
        Panel pm = new Panel();
        pm.add(lm); pm.add(cm);
        f.add(pm);
            //bottom
        Checkbox cb1 = new Checkbox("Register");
        Checkbox cb2 = new Checkbox("Search");
        Checkbox cb3 = new Checkbox("List All");
        Checkbox cb4 = new Checkbox("Count");
        Checkbox cb5 = new Checkbox("Exit");
        Button btb = new Button("Continue");
        Panel pb = new Panel();
        pb.add(cb1); pb.add(cb2); pb.add(cb3); pb.add(cb4); pb.add(cb5); pb.add(btb);
        f.add(pb);

                  
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
    }
}
