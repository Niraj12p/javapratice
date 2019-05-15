
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public  class Keyeventdemo extends KeyAdapter{
    JFrame f1;
    JTextField t1,t2;
    Keyeventdemo()
    {
        f1=new JFrame();

        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1=new JTextField(10);
        t2=new JTextField(10);
        f1.add(t1);
        f1.add(t2);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        f1.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new Keyeventdemo();
    }
    public void keyTyped(KeyEvent e)
    {
       
        char ch= e.getKeyChar();
        if(e.getSource()==t1)
        {
            if(ch>='0' && ch<='9'){
                e.consume();
                
            }
        }
            else{
                if(!(ch>='0' && ch<='9'))
                {
                    e.consume();
                }
            }
        }
    }
    

