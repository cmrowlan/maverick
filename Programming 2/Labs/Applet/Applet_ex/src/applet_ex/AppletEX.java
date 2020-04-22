/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applet_ex;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author Chase
 */
public class AppletEX extends Applet implements Runnable {
    int start;
    int init;
    int paint;
    int stop;
    int destroy;
    
    Thread th;
    int run;
    
    int x_pos;
    int y_pos;
    int radius;
    
    
    public void start(){
        start++;
        th = new Thread(this);
        th.start();
    }
    public void init(){
        //init++;
        x_pos = 10;
        y_pos = 10;
        radius = 5;
    }
    
    public void stop(){
        stop++;
    }
    public void destroy(){
        destroy++;
    }
    public void paint(Graphics g){
        
        paint++;
        //paint vairables
        g.drawString("Timer: " + run, 10, 50);
        g.setColor(Color.BLUE);
        g.fillOval(x_pos-radius, y_pos-radius, radius*2, radius*2);
        
    }

    @Override
    public void run() {
        while(true){
            run++;
            try{
                x_pos += 5;
                y_pos += 5;
                repaint();
                Thread.sleep(1000);
            }catch(InterruptedException ex){
                
            }
        }
        }
}
