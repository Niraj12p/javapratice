
package org.niraj.javapratice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JToggleButtonDemo implements ItemListener{
 JFrame f1;
 JToggleButton tb;
  JToggleButtonDemo()
  {
      f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        tb= new JToggleButton ("Pooza");
        f1.add(tb);
        tb.addItemListener(this);
        f1.setVisible(true);
  }
    public static void main(String[] args) {
        new  JToggleButtonDemo ();
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(tb.isSelected())
        {
            tb.setText("OFF");
        }
        else
            tb.setText("ON");
    }
}
