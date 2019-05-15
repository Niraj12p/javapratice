
package org.niraj.javapratice;
import java.util.*;
public class Collection {

    public static void main(String[] args) {
       ArrayList<String> a=new ArrayList<String>();
        a.add("niraj");
        a.add("pooza");
        a.add("pujan");
        a.add("pukar");
        a.add(0,"Ram");//adding elements in the specific position
        a.remove("niraj");
        a.remove(3);
       // System.out.println(a);
      /* Iterator it=a.iterator();
       while(it.hasNext())
       {
           System.out.println(it.next());
       */
      for(String s:a)
      {
          System.out.println(s);
      
        
    }
    
}
}
