
package org.niraj.javapratice;
import javax.swing.*;
public class UsingnoLayout {
    JFrame f1;
    JLabel l1,l2;
    JTextField t1,t2;
    JButton b1,b2;
    UsingnoLayout()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        l1=new JLabel("Id");
        l1.setBounds(10,10,80,25);
        f1.add(l1);
        l2=new JLabel("Name");
        l2.setBounds(10,45,80,25);
        f1.add(l2);
        t1=new JTextField();
        t1.setBounds(100,10,80,25);
        f1.add(t1);
        t2=new JTextField();
        t2.setBounds(100,45,160,25);
        f1.add(t2);
        b1=new JButton("ok");
        b1.setBounds(100,80,80,25);
        f1.add(b1);
        b2=new JButton("cancel");
        b2.setBounds(190,80,80,25);
        f1.add(b2);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new UsingnoLayout();
    }
    
}
