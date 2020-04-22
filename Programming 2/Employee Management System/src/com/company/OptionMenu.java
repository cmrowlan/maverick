package com.company;


import javax.naming.directory.SearchControls;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Chase
 */
public class OptionMenu extends JFrame implements ItemListener, ActionListener {
    //field
    Choice cm = new Choice();
    Button btb = new Button("Continue");
    String option;
    //method


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

        cm.addItemListener(this);
        cm.add(" ");
        cm.add("Register");
        cm.add("Search");
        cm.add("List All");
        cm.add("Count");
        cm.add("Exit");
        btb.addActionListener(this);
        Panel pm = new Panel();
        pm.add(lm); pm.add(cm); pm.add(btb);
        f.add(pm);
            //bottom

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        option = (String)e.getItem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //if item is register then move to that page
        if (option.equals("Register"))
            new Register();
        if (option.equals("Search"))
            new Search();
        if (option.equals("List All")) {
            try {
                new ListAll();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        if (option.equals("Count")) {
            try {
                new Count();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        }
        if (option.equals("Exit"))
            System.exit(0);

    }
}
