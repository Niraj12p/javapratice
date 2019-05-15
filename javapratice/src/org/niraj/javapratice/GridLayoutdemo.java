
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;

 class GridLayoutdemo {
    JFrame f1;
    JButton b1,b2;
    JTextField t1,t2;
    JLabel l1,l2;
    GridLayoutdemo()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout(3,2));
        l1=new JLabel("Name");
        l2=new JLabel("Address");
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Ok");
        b2=new JButton("Cancel");
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
        
        
    }

    public static void main(String[] args) {
        new GridLayoutdemo();
    }
    
}

