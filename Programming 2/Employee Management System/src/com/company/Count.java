package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

/**
 *
 * @author Chase
 */
public class Count extends JFrame implements ActionListener {
    //field
    Button btb = new Button("Go Back");

    //method

    //c
    Count(){
        //container
        JFrame f = new JFrame("Search");
        f.setBounds(10, 10, 600, 400);

        //layout
        GridLayout gl = new GridLayout(3, 1);
        f.setLayout(gl);

        //component
        Font font1 = new Font("Times New Romans", Font.BOLD, 24);
        Font font2 = new Font("Times New Romans", Font.BOLD, 12);


        //top
        Label lt = new Label("Employee Management System: Search", Label.CENTER);
        lt.setFont(font1);
        lt.setForeground(Color.BLUE);
        f.add(lt);

        //middle
        Panel pm = new Panel();
        Label lm1 = new Label(Integer.toString(DB.counter));
        pm.add(lm1);

        //bottom
        btb.addActionListener(this);

        f.add(pm);
        f.add(btb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new OptionMenu();
    }
}
