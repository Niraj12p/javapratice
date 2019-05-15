
package org.niraj.javapratice;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;
public class ClockwiseRotationDemo extends Applet{
         public void paint(Graphics g)
    {
         Graphics2D g2D=(Graphics2D)g;
         AffineTransform rotate=new AffineTransform();
    
         g2D.drawRect(120,180,50,100);
         rotate.setToRotation(Math.toRadians(45),400,400);
         
         g2D.setTransform(rotate);
         g2D.setColor(Color.blue);
          g2D.drawRect(120,180,50,100);
}
    
}
