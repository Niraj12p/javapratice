
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CardLayoutDemo implements ActionListener {
   
JFrame f1;
JPanel p1,p2,p3;
CardLayout c;
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3,t4;
JButton b1,b2;
CardLayoutDemo()
{
  
        f1=new JFrame();
        f1.setSize(300,300);
        c= new CardLayout();
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        p1=new JPanel();
        p1.setLayout(c);
        p2=new JPanel();
        p3=new JPanel();
        l1=new JLabel("Student name");
        l2=new JLabel("Faculty");
        t1=new JTextField(10);
        t2=new JTextField(10);
        p2.add(l1);p2.add(t1);
        p2.add(l2);p2.add(t2);
        b1=new JButton("Next");
        p2.add(b1);
        b1.addActionListener(this);
        l3=new JLabel("GuardianName");
        l4=new JLabel("contactno");
        t3=new JTextField(10);
        t4=new JTextField(10);
        b2= new JButton("Prev");
        p3.add(l3);p3.add(t3);
        p3.add(l4);p3.add(t4);
        p3.add(b2);
        b2.addActionListener(this);
        p1.add(p2);
        p1.add(p3);
        f1.add(p1);
        f1.setVisible(true);
}  
    public static void main(String[] args) {
      new CardLayoutDemo();  
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            c.last(p1);
        }
        else
        {
            c.first(p1);
        }
    }

    
}
