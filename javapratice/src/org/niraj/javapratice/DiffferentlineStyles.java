
package org.niraj.javapratice;
import java.applet.*;
import java.awt.*;
public class DiffferentlineStyles extends Applet {
    public void paint(Graphics g)
    {
        Graphics2D g2D=(Graphics2D)g;
        float[]dashpattern={30,10,10,10};
        //g2D.drawLine(100,200,200,100);
        g2D.setStroke(new BasicStroke(8,BasicStroke.CAP_BUTT,BasicStroke.JOIN_BEVEL,10,dashpattern,0));
         g2D.drawLine(100,200,200,100);
        
    }
    
}
