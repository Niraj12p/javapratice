
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Eventdemo2 implements ActionListener {
    JFrame f1;
    JTextField t1;
    JButton b1,b2;
    Eventdemo2()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1=new JTextField(10);
        b1=new JButton("ok");
        b2=new JButton("clear");
        f1.add(t1);
        f1.add(b1);
        f1.add(b2);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    public static void main(String[] args) {
        new Eventdemo2();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            t1.setText("Hello");
        }
        else
            t1.setText("");
    }
    
}
