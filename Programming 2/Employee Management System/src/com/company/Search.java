package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Chase
 */
public class Search extends JFrame{
    //field


    //method
    void actionPerformed(ActionEvent ae){

    }


    //c
    Search(){
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

        //bottom



        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
