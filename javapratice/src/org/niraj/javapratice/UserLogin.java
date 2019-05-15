package org.niraj.javapratice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class UserLogin implements ActionListener {

    JFrame f1;
    JLabel l1, l2;
    JButton b1;
    JTextField t1;
    JPasswordField p1;

    UserLogin() {
        f1 = new JFrame();
        f1.setSize(300, 300);
        f1.setLayout(new GridLayout(3,2));
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1 = new JLabel("Username");
        l2 = new JLabel("Password");
        t1 = new JTextField();
        p1 = new JPasswordField();
        b1 = new JButton("Login");
        f1.add(l1);f1.add(t1);
        
        f1.add(l2);f1.add(p1);
        
        f1.add(b1);
        b1.addActionListener(this);
        f1.setVisible(true);

    }
    public static void main(String[] args) {
        new UserLogin();
    }

    public void actionPerformed(ActionEvent e) {
        String a = t1.getText();
        String b = new String(p1.getPassword());

        String url = "jdbc:mysql://localhost:3306/sdc";
        String uname = "root";
        String pwd = "niraj";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pwd);
            String sql = "Select *from login where username=? and password=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, a);
            st.setString(2, b);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "LoginSucess");
            } else {
                JOptionPane.showMessageDialog(null, "LoginFailed");
            }

            con.close();
        }
            catch(Exception ex)
        {
            System.out.println(ex);
        }
        }
    
}
