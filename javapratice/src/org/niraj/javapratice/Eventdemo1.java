
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Eventdemo1 implements ActionListener {
    JFrame f1;
    JButton b1; 
    JTextField t1;
    Eventdemo1()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1=new JTextField(10);
        b1=new JButton("ok");
        f1.add(t1);
        f1.add(b1);
        f1.setVisible(true);
        
        b1.addActionListener(this);
    }
    
    public static void main(String[] args) {
       new Eventdemo1();
    }
    public void actionPerformed(ActionEvent e)
    {
        t1.setText("hello");
    }
    
}
