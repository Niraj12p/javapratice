
package org.niraj.javapratice;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class JListDemo implements ListSelectionListener{
    JFrame f1;
    JList mylist;
    JTextField t1;
    JListDemo()
    {
        
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new FlowLayout());
        t1=new JTextField(10);
        f1.add(t1);
        String item[]={" black coffe","black tea","milk tea","milk coffee","HotLemon","fanta","coke","slice","Hot Chocolate"};
        mylist=new JList(item);
        JScrollPane jp=new JScrollPane(mylist);
        f1.add(jp);
        mylist.setVisibleRowCount(7);
        //mylist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        mylist.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        mylist.addListSelectionListener(this);
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new JListDemo();
    }
    public void valueChanged(ListSelectionEvent e)
    {
        //t1.setText(mylist.getSelectedValue().toString());
     t1.setText(mylist.getSelectedValuesList().toString());
    }
    
}
