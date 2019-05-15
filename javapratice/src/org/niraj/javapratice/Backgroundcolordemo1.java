
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Backgroundcolordemo1 implements ActionListener {
    JFrame f1;
    JButton b1,b2,b3;
    Backgroundcolordemo1()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        b1=new JButton("Red");
        b2=new JButton("Green");
        b3=new JButton("Blue");
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public static void main(String[] args) {
        new Backgroundcolordemo1();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            b1.setBackground(Color.RED);
        }
        else if(e.getSource()==b2)
        {
            b2.setBackground(Color.GREEN);
        }
        else
            b3.setBackground(Color.blue);
    }
    
}
