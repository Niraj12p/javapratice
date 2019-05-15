
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
public class Tabbedpane {
JFrame f1;
JPanel p1,p2,p3;
JTabbedPane tp;
JButton b1,b2,b3,b4,b5,b6;
    public Tabbedpane() {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setLayout(new BorderLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // tp=new JTabbedPane(JTabbedPane.LEFT);
       tp=new JTabbedPane();
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        b1=new JButton("one");
        b2=new JButton("two");
        b3=new JButton("three");
        b4=new JButton("four");
        b5=new JButton("five");
        b6=new JButton("six");
        p1.add(b1);p1.add(b2);
        p2.add(b3);p2.add(b4);
        p3.add(b5);p3.add(b6);
        tp.addTab("one",p1);
        tp.addTab("two",p2);
        tp.addTab("three",p3);
        f1.add(tp);
        f1.setVisible(true);
        
        
        
        
        
        
    }

    
    public static void main(String[] args) {
 new Tabbedpane ();
    }
    
}
