package org.niraj.javapratice;

import java.applet.*;
import java.awt.*;
import java.util.*;
public class DdaDemo extends Applet {
     double dx, dy, steps, k, x1, x0, y1, y0;
    double xinc, yinc;
    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first two end point");
        x0 = sc.nextDouble();//100
        y0 = sc.nextDouble();//100
        System.out.println("Enter two end points");
        x1 = sc.nextDouble();//300
        y1 = sc.nextDouble();//300

    }
    public void paint(Graphics g) {    
   
        dx = x1 - x0;
        dy = y1 - y0;

        if (Math.abs(dx) > Math.abs(dy)) {
            steps = Math.abs(dx);
        } else {
            steps = Math.abs(dy);
        }
        xinc = (dx / steps);
        yinc = (dy / steps);
        double xk = x0;
        double yk = y0;
        g.fillOval((int) xk, (int) yk, 5, 5);
        for (k = 1; k <= steps; k++) {
            xk = xk + xinc;
            yk = yk + yinc;
            g.fillOval((int) xk, (int) yk, 5, 5);
        }
      
    }
}
