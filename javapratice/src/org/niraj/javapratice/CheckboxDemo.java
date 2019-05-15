
package org.niraj.javapratice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckboxDemo implements ActionListener {
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1;
    JRadioButton r1,r2;
    JCheckBox c1,c2,c3;
    JButton b1;
    CheckboxDemo ()
    {
        
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1=new JTextField(10);
        l1=new JLabel("Name");
        l2=new JLabel("Gender");
        l3=new JLabel("Hobbies");
        r1=new JRadioButton("Male");
         r2=new JRadioButton("Female");
          c1=new JCheckBox("Music");
            c2=new JCheckBox("Travelling");
              c3=new JCheckBox("Reading");
              b1=new JButton("OK");
              f1.add(l1);f1.add(t1);
              f1.add(l2);f1.add(r1);f1.add(r2);
              f1.add(l3);f1.add(c1);f1.add(c2);f1.add(c3);
              f1.add(b1);
              b1.addActionListener(this);
              ButtonGroup bg=new ButtonGroup();
              bg.add(r1);bg.add(r2);
              f1.setVisible(true);
    }
    public static void main(String[] args) {
        new CheckboxDemo();
    }
    public void actionPerformed(ActionEvent e)
    {
      String name=t1.getText();
      String gender="";
      if(r1.isSelected())
          gender="Male";
      String hobbies="";
      if(c1.isSelected())
          hobbies="Music";
       if(c2.isSelected())
           hobbies+="Travelling";
       if(c3.isSelected())
           hobbies+="Reading";
       JOptionPane.showMessageDialog(null,"Name:"+name+"\nGender:"+gender+"\nHobbies:"+hobbies);
              
      
    }
    }
    

