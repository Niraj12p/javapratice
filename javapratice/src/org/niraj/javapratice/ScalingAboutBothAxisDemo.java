
package org.niraj.javapratice;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ScalingAboutBothAxisDemo extends Applet
{
        public void paint(Graphics g)
    {
         Graphics2D g2D=(Graphics2D)g;
           //Rectangle2D .Double rect=new Rectangle2D.Double(120,180,50,100);//100,100,50,60
             //g2D.draw(rect);
              g2D.drawRect(120,180,50,100);
         //AffineTransform scaling1=new AffineTransform();
      
        
         //g2D.drawRect(120,180,50,100);
        //scaling1.scale(3,3);//scaling on both axes
        //scaling1.scale(3,1);//scaling on x axis
        //scaling1.scale(1,3);//scaling on y axis
       //g2D.setTransform(scaling1);
       g2D.scale(3,3);
         g2D.setColor(Color.red);
          g2D.drawRect(120,180,50,100);
          //g2D.draw(rect);
    
}
}
