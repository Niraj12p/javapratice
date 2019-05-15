//Anticlockwise rotation
package org.niraj.javapratice;
import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class RotationDemo extends Applet{
      public void paint(Graphics g)
    {
         Graphics2D g2D=(Graphics2D)g;
         
       
         //AffineTransform rotate=new AffineTransform();
           //g2D.drawRect(120,180,50,100);
           
      g.drawLine(300,300,350,300);
        g.drawLine(300,300,300,250);
        g.drawLine(300,250,350,250);
        g.drawLine(350,250,350,300);
        //rotate.setToRotation(Math.toRadians(-45),400,400);
      //rotate.setToRotation(Math.toRadians(-45));
         //g2D.setTransform(rotate);
        //g2D.rotate(Math.toRadians(180));
        g2D.rotate(Math.toRadians(180),400,400);//pivot rotaation
         g2D.setColor(Color.blue);
          //g2D.drawRect(120,180,50,100);
         
      g.drawLine(300,300,350,300);
        g.drawLine(300,300,300,250);
        g.drawLine(300,250,350,250);
        g.drawLine(350,250,350,300);
        
        
       
        
     
        
          
          
          
          
}
    
}
