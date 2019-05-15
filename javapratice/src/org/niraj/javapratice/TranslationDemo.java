
package org.niraj.javapratice;
import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
import java.util.Scanner;
public class TranslationDemo extends Applet{
    int a,b,c,d,e,f;
    public void init()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter four  point of rectangle");
   
    a=sc.nextInt();//120
    b=sc.nextInt();//180
       c=sc.nextInt();//50
        d=sc.nextInt();//100
    System.out.println("Enter translation vector");
   
       e=sc.nextInt();//190
        f=sc.nextInt();//200
    }
    public void paint(Graphics g)
    {
         Graphics2D g2D=(Graphics2D)g;
         //AffineTransform translate=new AffineTransform();
         g2D.drawRect(a,b,c,d);
         /*translate.setToTranslation(e,f);
         g2D.setTransform(translate);*/
         g2D.translate(e,f);
         g2D.setColor(Color.blue);
          g2D.drawRect(a,b,c,d);
    }
    
}
