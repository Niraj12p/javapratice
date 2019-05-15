
package org.niraj.javapratice;
import java.applet.*;
import java.awt.*;
public class DrawStringDemo extends Applet {
    public void paint(Graphics g)
    {
        
        g.setColor(Color.BLUE);
        g.setFont(new Font("Times New Roman",Font.BOLD,26));
        g.drawString("Shanker Dev Campus", 100, 50);
        
    }
    
}
