package org.niraj.javapratice;

import java.applet.*;
import java.awt.*;
import java.awt.geom.*;

public class RotationAboutPivotPoint extends Applet {

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawRect(120, 180, 50, 100);
       // AffineTransform at = AffineTransform.getRotateInstance(Math.toRadians(-45), 400, 400);//firstmethod
        //g2D.transform(at);
        
        
        g2D.translate(400,400);//last work is again to original position  //second method
        g2D.rotate(Math.toRadians(-45));//second work is to rotate
        g2D.translate(-400, -400);//first work is translate to origin
        g2D.setColor(Color.red);
        g2D.drawRect(120, 180, 50, 100);

        
        //g2D.rotate(Math.toRadians(-45),400,400);//pivot rotaation  //third method
    }
}
