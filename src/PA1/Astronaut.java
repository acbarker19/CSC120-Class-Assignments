package PA1;

/**
 *
 * File:  Astronaut.java
 * 
 * Author: Alec Barker
 * 
 * Description: Draws an astronaut that can be recolored.
 * 
 */

import java.awt.*;

public class Astronaut {

    private String  name;
    private Integer anchorX;
    private Integer anchorY;
    private Color   suitColor;
    private Color   patchColor;
    
    
    public Astronaut(String n, Integer x, Integer y, Color s, Color p) {
        name = n;
        anchorX = x;
        anchorY = y;
        suitColor = s;
        patchColor = p;
    } // end of constructor
    
    
    public void draw( Graphics g ) {
        
        //shadow
        g.setColor(Color.GRAY);
        g.fillOval(anchorX, anchorY, 100, 30);
        
        //left leg
        g.setColor(suitColor);
        g.fillRect(anchorX+10, anchorY, 30, 15);
        g.fillRect(anchorX+25, anchorY-70, 15, 70);
        
        //right leg
        g.fillRect(anchorX+60, anchorY, 30, 15);
        g.fillRect(anchorX+60, anchorY-70, 15, 70);
        
        //body
        g.fillRect(anchorX+25, anchorY-170, 50, 100);
        g.fillRect(anchorX, anchorY-170, 100, 25);
        g.fillRect(anchorX+35, anchorY-190, 30, 20);
        
        //left arm
        g.fillRect(anchorX, anchorY-170, 15, 100);
        
        //right arm
        g.fillRect(anchorX+85, anchorY-170, 15, 100);
        
        //head
        g.fillOval(anchorX+15, anchorY-250, 70, 70);
        
        //visor
        g.setColor(Color.ORANGE);
        g.fillOval(anchorX+25,anchorY-230, 50, 30);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX+25,anchorY-230, 50, 30);
        
        //name patch
        g.setColor(patchColor);
        g.fillRect(anchorX+60, anchorY-165, 35, 15);
        g.setColor(Color.BLACK);
        g.drawString(name, anchorX+65, anchorY-153);
        g.drawRect(anchorX+60, anchorY-165, 35, 15);
        
        //chest plate
        g.setColor(Color.GRAY);
        g.fillRect(anchorX+30, anchorY-145, 40, 30);
        g.setColor(Color.BLACK);
        g.drawLine(anchorX+35, anchorY-140, anchorX+35, anchorY-120);
        g.drawLine(anchorX+40, anchorY-140, anchorX+40, anchorY-120);
        g.drawLine(anchorX+45, anchorY-140, anchorX+45, anchorY-120);
        g.setColor(Color.RED);
        g.fillOval(anchorX+50, anchorY-140, 8, 8);
        g.setColor(Color.GREEN);
        g.fillOval(anchorX+60, anchorY-140, 8, 8);
        g.setColor(new Color(255,0,255));
        g.fillRect(anchorX+50, anchorY-128, 18, 10);
        g.setColor(Color.BLACK);
        g.drawOval(anchorX+50, anchorY-140, 8, 8);
        g.drawOval(anchorX+60, anchorY-140, 8, 8);
        g.drawRect(anchorX+50, anchorY-128, 18, 10);
        g.drawRect(anchorX+30, anchorY-145, 40, 30);
        
        
    } // end of draw()
    
} // end of class Astronaut
