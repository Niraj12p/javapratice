package org.niraj.javapratice;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Backgroundcolorframe implements ActionListener{
    JFrame f1;
    JPanel p1;
    JButton b1,b2,b3;
    Backgroundcolorframe()
    {
        f1=new JFrame();
        p1=new JPanel();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout());
        b1=new JButton("Red");
        b2=new JButton("Green");
        b3=new JButton("Blue");
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        f1.add(p1,BorderLayout.CENTER);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public static void main(String[] args) {
        new Backgroundcolorframe();
    }
    public void actionPerformed(ActionEvent e)
    {
       if(e.getSource()==b1)
       {
           p1.setBackground(Color.red);
       }
       else if(e.getSource()==b2)
       {
           p1.setBackground(Color.green);
       }
       else
       {
           p1.setBackground(Color.blue);
           
           }
}
    





}