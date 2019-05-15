
package org.niraj.javapratice;
import java.util.*;
import java.applet.*;
import java.awt.*;
public class BlaDemo extends Applet {
    
    int dx, dy, steps, k, x1, x0, y1, y0;
    int xinc, yinc,a,b,po,pk,xk,yk;
    
    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first two end point");
        x0 = sc.nextInt();//100
        y0 = sc.nextInt();//100
        System.out.println("Enter two end points");
        x1 = sc.nextInt();//300
        y1 = sc.nextInt();//300

    }
    public void paint (Graphics g)
    {
        
        dx=Math.abs(x1-x0);
        dy=Math.abs(y1-y0);
        if(x1>x0)
        {
             a=1;
        }
        else
        {
            a=-1;
        }
        if(y1>y0)
        {
            b=1;
        }
        else
        {
            b=-1;
        }
        if(dx>=dy)
        {
           po=2*dy-dx;
           xk=x0;
           yk=y0;
           pk=po;
           g.fillOval(xk,yk,5,5);
           for(k=1;k<=dx;k++)
           {
             if(pk<=0)
             {
               xk=xk+a;
               yk=yk;
               pk=pk+2*dy;
               g.fillOval(xk,yk,5,5);
             }
             else
             {
                 xk=xk+a;
                 yk=yk+b;
                 pk=pk+2*dy-2*dx;
                 g.fillOval(xk,yk,5,5);
             }
           }
           
        }
        else
        {
            
        if(dy>dx)
        {
           po=2*dx-dy;
           xk=x0;
           yk=y0;
           pk=po;
           g.fillOval(xk,yk,5,5);
           for(k=1;k<=dy;k++)
           {
             if(pk<=0)
             {
               xk=xk;
               yk=yk+b;
               pk=pk+2*dx;
               g.fillOval(xk,yk,5,5);
             }
             else
             {
                 xk=xk+a;
                 yk=yk+b;
                 pk=pk+2*dx-2*dy;
                 g.fillOval(xk,yk,5,5);
             }
        }
    }
    
}
    }
}
