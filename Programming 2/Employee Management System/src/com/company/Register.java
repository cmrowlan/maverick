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
public class Register extends JFrame implements ActionListener, TextListener {
    //field
    TextArea tab = new TextArea(2, 40);
    Button btb = new Button("Continue");
    String result;
    Label lm1 = new Label("Name: ");
    Label lm2 = new Label("ID: ");
    Label lm3 = new Label("DOB: ");
    Label blank = new Label("           ");
    TextField tfm1 = new TextField(20);
    TextField tfm2 = new TextField(20);
    TextField tfm3 = new TextField(20);
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

        Panel pm = new Panel();
        pm.add(lm1);pm.add(tfm1);pm.add(lm2);pm.add(tfm2);pm.add(blank); pm.add(lm3);pm.add(tfm3);
        tfm1.addTextListener(this);tfm2.addTextListener(this);tfm3.addTextListener(this);
        btb.addActionListener(this);
        //bottom
         Panel pb = new Panel();
        pb.add(btb);pb.add(tab);

        f.add(pm);
        f.add(pb);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        result = tfm1.getText() + "Successfully registered";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            DB.register(tfm1.getText(), tfm2.getText(), tfm3.getText());
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        tab.append(result);
        new OptionMenu();
    }

    @Override
    public void textValueChanged(TextEvent e) {

    }
}
