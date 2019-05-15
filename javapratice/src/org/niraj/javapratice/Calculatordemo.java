package org.niraj.javapratice;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculatordemo implements ActionListener {

    JFrame f1;
    JTextField t1, t2, t3;
    JLabel l1, l2, l3;
    JButton b1, b2, b3, b4;

    Calculatordemo() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout(5, 2));
        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("multiply");
        b4 = new JButton("Divide");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        l1 = new JLabel("Num1");
        l2 = new JLabel("Num2");
        l3 = new JLabel("Result");

        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(l3);
        f1.add(t3);
        f1.add(b1);
        f1.add(b2);
        f1.add(b3);
        f1.add(b4);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        Font font = new Font("Times New Roman", Font.BOLD, 22);
        t1.setFont(font);
        t2.setFont(font);
        t3.setFont(font);

        t3.setEditable(false);

    }

    public static void main(String[] args) {
        new Calculatordemo();
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = 0;
        if (e.getSource() == b1) {
            c = a + b;
        } else if (e.getSource() == b2) {
            c = a - b;
        } else if (e.getSource() == b2) {
            c = a * b;
        } else {
            c = a / b;
        }
        t3.setText(c + "");
    }
}
