package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 *
 * @author Chase
 */
public class Register extends JFrame implements ActionListener, TextListener {
    //field
    TextArea tab = new TextArea(2, 40);
    Button btb = new Button("Continue");
    String result;
    //method



    //c
    Register(){
        //container
        JFrame f = new JFrame("Register");
        f.setBounds(10, 10, 600, 400);

        //layout
        GridLayout gl = new GridLayout(3, 1);
        f.setLayout(gl);

        //component
        Font font1 = new Font("Times New Romans", Font.BOLD, 24);
        Font font2 = new Font("Times New Romans", Font.BOLD, 12);


        //top
        Label lt = new Label("Employee Management System: Register", Label.CENTER);
        lt.setFont(font1);
        lt.setForeground(Color.BLUE);
        f.add(lt);

        //middle
        result = "Successfully registered";
        Panel pm = new Panel();
        pm.add(btb);
        btb.addActionListener(this);
        //bottom
         Panel pb = new Panel();
        pb.add(tab);

        f.add(pm);
        f.add(pb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tab.append(result);
    }

    @Override
    public void textValueChanged(TextEvent e) {

    }
}
