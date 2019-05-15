
package org.niraj.javapratice;
import java.applet.*;
import java.awt.*;
public class Appletdemo extends Applet {
  public void paint(Graphics g) 
  {
     g.drawOval(20,20,100,100);
     g.drawOval(40,40,20,20);
     g.drawOval(80,40,20,20);
     g.drawArc(60,80,40,40,100,100);
  }
    
    
}
