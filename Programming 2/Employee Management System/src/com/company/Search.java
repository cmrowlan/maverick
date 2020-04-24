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
public class Search extends JFrame implements ActionListener, TextListener {
    //field
    Label lm1 = new Label("Enter ID: ");
    TextField tfm1 = new TextField(20);
    Button btm = new Button("Search");
    public static Label lb1 = new Label("", Label.CENTER);

    //method


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
        Panel pm = new Panel();
        pm.add(lm1);pm.add(tfm1);pm.add(btm);
        btm.addActionListener(this);
        //bottom
        Panel pb = new Panel();
        pb.add(lb1);

        f.add(pm);
        f.add(pb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        lb1.setSize(100,100);
        //search method called to find text to print
        try {
            lb1.setText(DB.search(tfm1.getText()));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }


    @Override
    public void textValueChanged(TextEvent e) {

    }
}
