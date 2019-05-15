
package org.niraj.javapratice;
import java.applet.*;
import java.awt.*;
public class DifferentShapes extends Applet {
    public void paint(Graphics g)
    {
        //to draw line
     //g.drawLine(10, 10,200,10);
        //g.drawLine(10,10,200,200);
       // g.drawLine(10,100,200,20);
       // g.drawLine(10,10,10,100);
        //to draw rectangle
        //g.drawRect(10,80,200,100);
        //g.fillRect(10,80,200,100);
        //to draw oval
        //g.drawOval(10,80,200,100);
       // g.fillOval(10,80,200,100);
        //g.drawOval(10,80,100,100);
        //to draw arc
        //g.drawArc(10,80,100,100,0,-180);
        //to draw polygon
       /*Polygon p= new Polygon();
        p.addPoint(100,10);
       
        p.addPoint(10,200);
         p.addPoint(200,200);
    g.drawPolygon(p);*/
    //to display ShankerDev campus inside rectangle
   /* g.drawRect(10,20,200,50);
    g.drawString("Shankerdev Campus",30 ,40);*/
        
        //to draw thick rectangle
        Graphics2D g2D=(Graphics2D)g;
        //g2D.setStroke(new BasicStroke(3));
        //g2D.drawRect(10,20,200,60);
        //g2D.drawString("niraj", 50, 50);
        
       /* g.drawLine(10,200,200,200);
        g.drawLine(10,200,100,10);
        g.drawLine(100,10,200,200);*///triangle
        
       /* g.drawLine(10,100,100,100);
        g.drawLine(10,100,10,10);
        g.drawLine(10,10,100,10);
        g.drawLine(100,10,100,100);*///rectangle
        
       /*g.drawLine(120,300,200,300);
        g.drawLine(120,300,120,250);
        g.drawLine(120,250,200,250);
        g.drawLine(200,250,200,300);*/
      /* g.drawLine(300,300,350,300);
        g.drawLine(300,300,300,250);
        g.drawLine(300,250,350,250);
        g.drawLine(350,250,350,300);*/
      
       
       g.drawLine(300,200,400,200);
        g.drawLine(300,200,350,150);
        g.drawLine(350,150,400,200);
       
        
       
       
    }
    
    
}
