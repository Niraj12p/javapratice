
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Menudemo {
    JFrame f1;
    JMenu menu1;
    JMenuBar bar;
    JMenuItem mi1,mi2;
    Menudemo()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        bar=new JMenuBar();
        mi1=new JMenuItem("New");
        mi2=new JMenuItem("Exit");
        menu1=new JMenu("File");
        menu1.add(mi1);
        menu1.add(mi2);
        bar.add(menu1);
        f1.setJMenuBar(bar);
        mi1.addActionListener(new EventDemo());
        mi2.addActionListener(new EventDemo());
        
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new Menudemo();
    }
    class EventDemo implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==mi1)
            {
                new Mouseeventdemo();
            }
            else
                f1.dispose();
        }
    }
}
