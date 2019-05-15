package org.niraj.javapratice;



import java.awt.*;
import java.awt.event.*;
public class Awtframedemo extends WindowAdapter{
    Frame f1;
    Awtframedemo()
    {
        f1=new Frame();
        f1.setSize(300,300);
        f1.addWindowListener(this);
          f1.setVisible(true); 
                
            }
    public static void main(String[] args) {
    new Awtframedemo();
    }
    
    public void windowClosing(WindowEvent e)
    {
       f1.dispose(); 
    }
}
