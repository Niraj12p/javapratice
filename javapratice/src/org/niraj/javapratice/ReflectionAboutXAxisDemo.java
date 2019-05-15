

package org.niraj.javapratice;
import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class ReflectionAboutXAxisDemo extends Applet {
    public void paint(Graphics g)
    {
         Graphics2D g2D=(Graphics2D)g;
         int x1,y1,x2,y2,x3,y3;
         x1=300;
         y1=200;
         x2=400;
         y2=200;
         x3=350;
         y3=150;
       g2D.drawLine(x1,y1,x2,y2);
        g2D.drawLine(x1,y1,x3,y3);
        g2D.drawLine(x3,y3,x2,y2);
        
        
        x1=300;
         y1=-200;
         x2=400;
         y2=-200;
         x3=350;
         y3=-150;
         
        
       g2D.drawLine(x1,y1,x2,y2);
        g2D.drawLine(x1,y1,x3,y3);
        g2D.drawLine(x3,y3,x2,y2);
          
         
    
}
}
