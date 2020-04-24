package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.io.IOException;

/**
 *
 * @author Chase
 */
public class ListAll extends JFrame implements ActionListener, TextListener {
    //field

    public static TextArea tam = new TextArea();
    Button btb = new Button("Go Back");

    //method

    //c
    ListAll() throws IOException {
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
        Label lt = new Label("Employee Management System: List", Label.CENTER);
        lt.setFont(font1);
        lt.setForeground(Color.BLUE);
        f.add(lt);

        //middle
        Panel pm = new Panel();
        pm.add(tam);
        //bottom
        btb.addActionListener(this);
        DB.listEmployees();
        f.add(pm);
        f.add(btb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //uses go back button to indicate a return to menu
        new OptionMenu();
    }

    @Override
    public void textValueChanged(TextEvent e) {

    }
}
