package PA1;

/**
 *
 * File:  Star.java
 * 
 * Author: Alec Barker
 * 
 * Description: Draws a star that can be resized
 * 
 */

import java.awt.*;

public class Star {
    
    private Integer anchorX;
    private Integer anchorY;
    private Integer size;
    
    public Star(Integer x, Integer y, Integer s) {
        anchorX = x;
        anchorY = y;
        size = s;
    } // end of constructor
    
    
    public void draw( Graphics g ) {
        //bg color
        g.setColor(Color.YELLOW);
        g.fillOval(anchorX-(size/4), anchorY+(size/4), size/2, size/2);
        
        //draws over bg color to give a star shape
        g.setColor(Color.BLACK);
        g.fillArc(anchorX, anchorY, size/2, size/2, 180, 90);//tr
        g.fillArc(anchorX-(size/2), anchorY, size/2, size/2, 0, -90);//tl
        g.fillArc(anchorX, anchorY+(size/2), size/2, size/2, 180, -90);//br
        g.fillArc(anchorX-(size/2), anchorY+(size/2), size/2, size/2, 0, 90);//bl
        
        //draws orange outline around the star
        g.setColor(Color.ORANGE);
        g.drawArc(anchorX, anchorY, size/2, size/2, 180, 90);//tr
        g.drawArc(anchorX-(size/2), anchorY, size/2, size/2, 0, -90);//tl
        g.drawArc(anchorX, anchorY+(size/2), size/2, size/2, 180, -90);//br
        g.drawArc(anchorX-(size/2), anchorY+(size/2), size/2, size/2, 0, 90);//bl
        
        //draws lines through the star
        g.drawLine(anchorX, anchorY+(size/4), anchorX, anchorY+((4*size)/5));
        g.drawLine(anchorX-(size/4), anchorY+(size/2), anchorX+(size/4), anchorY+(size/2));
    } // end of draw() 
    
} // end of class Star
