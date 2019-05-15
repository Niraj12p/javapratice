
package org.niraj.javapratice;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class DisplayDataInTable implements ActionListener{
    JFrame f1;
    JButton b1;
    JTable t1;
    DisplayDataInTable()
    {
        f1=new JFrame();
        f1.setSize(300,300);
        f1.setLayout(new BorderLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1=new JButton("Load Data");
        f1.add(b1,BorderLayout.SOUTH);
        b1.addActionListener(this);
        f1.setVisible(true);
        
    }
    public static void main(String[] args) {
        new  DisplayDataInTable();
    }
    public void actionPerformed(ActionEvent e)
    {
        String url="jdbc:mysql://localhost:3306/sdc";
        String uname="root";
        String pwd="niraj";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pwd);
            String sql="select *from employee";
            Statement st=con.createStatement();
           ResultSet rs=st.executeQuery(sql);
           String cols[]={"id","name","post","salary"};
           int rowcount=0;
           while(rs.next())
           {
               rowcount++;
           }
           Object[][]data=new Object[rowcount][4];
           int i=0;
           rs.beforeFirst();
           while(rs.next())
           {
               
           
           data[i][0]=rs.getString(1);
             data[i][1]=rs.getString(2);
               data[i][2]=rs.getString(3);
                 data[i][3]=rs.getString(4);
           i++;
           }
            con.close();
            t1=new JTable(data,cols);
            JScrollPane jp=new JScrollPane(t1);
            
            f1.add(jp);
            f1.setVisible(true);
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
            
        }
        catch(SQLException ex)
        {
           System.out.println(ex); 
        }
    }
    
    
}
