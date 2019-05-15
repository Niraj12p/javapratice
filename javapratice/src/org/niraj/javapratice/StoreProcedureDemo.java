

package org.niraj.javapratice;
import java.sql.*;
import java.util.*;
public class StoreProcedureDemo {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter name,post and salary");
        //System.out.println("Enter id");
        
       // String name=sc.next();
        //String post=sc.next();
        //double salary=sc.nextDouble();
        //int id=sc.nextInt();
        
        String url="jdbc:mysql://localhost:3306/sdc";
        String uname="root";
        String pwd="niraj";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pwd);
            //CallableStatement st=con.prepareCall("{call delete_employee6(?)}");
            //CallableStatement st=con.prepareCall("{call insert_employee8(?,?,?)}");
            CallableStatement st=con.prepareCall("{call select_employee()}");
           // Statement st=con.createStatement();
            //st.setString(1,name);
            //st.setString(2,post);
            //st.setDouble(3, salary);
            //st.setInt(1, id);
                      ResultSet rs=st.executeQuery();
        while(rs.next()){
            System.out.print(rs.getString("id")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("post")+"\t");
            System.out.println(rs.getString("salary")+"\t");
        }
            con.close();
        }
            catch(Exception ex)
                    {
                    
                    }
        
    }
      
}
