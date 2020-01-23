package PA3;

/*
    Alec Barker
    10/16/17

    Description:
        Draws parrots in the MUFrame, which can be red, cyan, or green,
        and may or may not be flying. This class also holds the methods for
        changing the color of the parrots and whether they are flying.
*/

import java.awt.*;

public class Parrot {
    
    private Color body;
    private Integer size;
    private Boolean isFlying;
    private Integer anchorX, anchorY;
    
    public Parrot(Color b, Integer s, Boolean f, Integer x, Integer y) {
        body = b;
        size = s;
        isFlying = f;
        anchorX = x;
        anchorY = y;
    }
    
    public void draw(Graphics g) {
        
        //beak
        g.setColor(Color.YELLOW);
        g.fillRect(anchorX - size/16, anchorY + (3*size)/16, size/8, size/16);
        
        //legs
        g.fillRect(anchorX + size/18, anchorY + (4*size)/5, size/32, size/4);
        g.fillRect(anchorX + (2*size)/9, anchorY + (4*size)/5, size/32, size/4);
        
        //head and body
        g.setColor(body);
        g.fillOval(anchorX, anchorY, size/3, size/3);
        g.fillOval(anchorX, anchorY + (3*size)/12, size/3, (2*size)/3);
        
        //wing
        if(isFlying == true) {
            g.fillRect(anchorX + (3*size)/12, anchorY + size/3, size/4, size/3);
            g.fillRect(anchorX + (3*size)/12, anchorY + (4*size)/9, (3*size)/8, (2*size)/9);
            g.fillRect(anchorX + (3*size)/12, anchorY + (5*size)/9, size/2, (5*size)/36);
        }
        
        //eye
        g.setColor(Color.BLACK);
        g.fillOval(anchorX + size/16, anchorY + size/16, size/16, size/16);
        
        //belly
        g.setColor(Color.YELLOW);
        g.fillOval(anchorX, anchorY + (4 * size)/9, size/6, size/3);
    }
    
    public void changeIsFlying() {
        isFlying = !isFlying;
    }
    
    public void changeColor() {
        if (body.equals(Color.RED)) {
            body = Color.GREEN;
        }
        else if (body.equals(Color.GREEN)) {
            body = Color.CYAN;
        }
        else if (body.equals(Color.CYAN)) {
            body = Color.RED;
        }
    }
    
}
