package org.niraj.javapratice;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class ShearAboutXdirectionDemo extends Applet {

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawRect(1, 2, 50, 100);//120,180
       // g2D.shear(0.5, 1);
        g2D.shear(1, -2);//y-axis
      // g2D.shear(0.5, 0.5);
        g2D.setColor(Color.red);
        g2D.drawRect(1, 2, 50, 100);
        
        
    }
}
