
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Focuseventdemo implements FocusListener {
    JFrame f1;
    JTextField t1,t2;
    Focuseventdemo()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1=new JTextField(10);
        t1=new JTextField(10);
        f1.add(t1);
        f1.add(t2);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
       new Focuseventdemo();
    }
    public void focusGained(FocusEvent e)
    {
        if(e.getSource()==t1)
        {
            t1.setBackground(Color.red);
        }
        else
            t2.setBackground(Color.red);
    }
    public void focusLost(FocusEvent e)
    {
       if(e.getSource()==t1)
       {
           t1.setBackground(Color.gray)
                   ;
       }
       else{
           t2.setBackground(Color.gray);
       }
    }
    
    
}
