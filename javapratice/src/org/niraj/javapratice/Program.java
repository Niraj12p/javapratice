
package org.niraj.javapratice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by n12p on 2/4/2019.
 */
public class Program {
 //student.java ma define name haru
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
          List<Student> studentList=new ArrayList<Student>();
        
        //Student s1= new Student(1,"niraj","kumar","thapa");
        //System.out.println(s1.toString());
        while(true){
            
        
        System.out.println("1.Add Record");
        System.out.println("2.Get All Record");
        System.out.println("3.Exit");
        int choice =scanner.nextInt();
        switch(choice)
        {
            case 1:
                
        

      Student s=new Student();
        studentList.add( s);
                System.out.println("Enter id");
                
                s.setId(scanner.nextInt());
                System.out.println("Enter first name");
                s.setFirstName(scanner.next());
                System.out.println("Enter middle name");
                s.setMiddleName(scanner.next());
                System.out.println("Enter last name");
                s.setLastName(scanner.next());
                break;
            case 2:
      

        
                for(Student s1:studentList)
                {
                    
                    System.out.println(s1);
                }

                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Wrong input");
        }
        
    }
}
}
