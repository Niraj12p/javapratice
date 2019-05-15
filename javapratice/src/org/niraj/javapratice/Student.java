
package org.niraj.javapratice;



import java.util.ArrayList;
import java.util.List;


public class Student {
    private int id;
    private String firstName, middleName, lastName;
    
    
/*public Student()
{
    
}*/
   /* public Student(int id, String firstName, String middleName, String lastName) {
        this.id = id;
        this.firstName = firstName;

        this.middleName = middleName;
        this.lastName = lastName;
    }*/

   /* public int getId() {
        return id;
    }*/

    public void setId(int id) {
        this.id = id;
    }

   /*public String getFirstName() {
        return firstName;
    }*/

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

   /*public String getMiddleName() {
        return middleName;
    }*/

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    

    public void setLastName(String lastName) {
        this. lastName=lastName;
    }

   public String getLastName() {
        return lastName;
    }
public String toString()
{
    return id+firstName+middleName+lastName;
}


}