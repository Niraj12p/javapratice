
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Mouseeventdemo implements MouseListener {
    JFrame f1;
    JPanel p1;
    JLabel l1;
    Mouseeventdemo()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new BorderLayout());
        p1=new JPanel();
        l1=new JLabel("Status");
        f1.add(p1,BorderLayout.CENTER);
        f1.add(l1,BorderLayout.SOUTH);
        p1.addMouseListener(this);
       // l1.addMouseListener(this);
        f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        new Mouseeventdemo();
    }
    public void mouseEntered(MouseEvent e)
    {
        p1.setBackground(Color.red);
    }
    public void mouseExited(MouseEvent e)
    {
        p1.setBackground(Color.green);
                
    }
    public void  mousePressed(MouseEvent e)
    {
        l1.setText("MousePressed");
    }
    public void mouseReleased(MouseEvent e)
    {
        l1.setText("Mouse Released");
    }
    public void mouseClicked(MouseEvent e)
    {
        l1.setText("MouseClicked at"+e.getX()+","+e.getY());
    }
}
