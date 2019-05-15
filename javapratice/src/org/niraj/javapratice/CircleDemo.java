
package org.niraj.javapratice;
import java.awt.*;
import java.applet.*;
import java.util.*; 
public class CircleDemo  extends Applet
{
     int xc,yc,r,po,xk,yk,xo,yo,pk;
    public void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter center point");
   
    xc=sc.nextInt();//125
    yc=sc.nextInt();//125
    System.out.println("Enter radius");
    r=sc.nextInt();//60
    
    }
    public void paint(Graphics g)
    {
    po=1-r;
    xo=0;
    yo=60;
    xk=xo;
    yk=yo;
    pk=po;
    while(xk<=yk)
  {
      if(pk<=0)
      {
     xk=xk+1;
     pk=pk+2*xk+1;
        }
      else
      {
        
     xk=xk+1;
     yk=yk-1;
     pk=pk+2*xk-2*yk+1;  
      }
    
g.drawLine(xc+xk,yc+yk,xc+xk,yc+yk);
g.drawLine(xc+yk,yc+xk,xc+yk,yc+xk);
g.drawLine(xc-yk,yc+xk,xc-yk,yc+xk);
g.drawLine(xc-xk,yc+yk,xc-xk,yc+yk);
g.drawLine(xc-xk,yc-yk,xc-xk,yc-yk);
g.drawLine(xc-yk,yc-xk,xc-yk,yc-xk);
g.drawLine(xc+yk,yc-xk,xc+yk,yc-xk);
g.drawLine(xk+xc,yc-yk,xc+xk,yc-yk);





}
    
    
}
}