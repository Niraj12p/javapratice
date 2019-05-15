
package org.niraj.javapratice;
import java.sql.*; 
class Insertdata{
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/sdc";
        String uname="root";
        String pwd="niraj";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,uname,pwd);
            String sql="insert into employee(name,post,salary)values ('poonam','insp',9000)";
             //String sql1="insert into employee(name,post,salary)values ('maya','Insp',80000),('pujan','assistant',2000),('pukar','officer',9000),('nikesh','pihun',200)";
            Statement st=con.createStatement();
            st.execute(sql);
            con.close();
            
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
    
