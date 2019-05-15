
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ComboxBoxdemo implements ItemListener{
    JFrame f1;
    JComboBox cb1;
    JTextField t1;
    ComboxBoxdemo()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
     t1=new JTextField(10);
     String item[]={"Tea","coffee","Hotlemon"};
     cb1=new JComboBox(item);
     f1.add(cb1);
     f1.add(t1);
     cb1.addItemListener(this);
     f1.setVisible(true);
    }
    public static void main(String[] args) {
        new ComboxBoxdemo();
    }
    public void itemStateChanged(ItemEvent e)
    {
        t1.setText(cb1.getSelectedItem().toString());
    }
    
}

























