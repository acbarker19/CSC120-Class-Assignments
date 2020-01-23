package PA6;

/* CSC 120 Project # 6
 * Alec Barker
 * 11/10/17
 *
 * Project Description:
 *      Has a user go from one side of the screen to another, capture a flag,
 *      then go back. The user must also avoid enemy knights.
 *
 * Acknowledgements:
 * 
 */

import java.awt.*;

public class Obstacle {
    
    private final Integer LEFT_EDGE  = 0;
    private final Integer RIGHT_EDGE  = 600;
    private final Integer TOP_EDGE  = 0;
    private final Integer BOTTOM_EDGE = 500;
    
    private Integer over, down;
    private Integer width = 22; 
    private Integer height = 30;
    private Integer verticalStepSize = 20;
    
    public Obstacle(Integer x, Integer y){
        over = x;
        down = y;
    }
    
    public Integer getLeft(){
        return over;
    }
    
    public Integer getRight(){
        return over + width;
    }
    
    public Integer getTop(){
        return down;
    }
    
    public Integer getBottom(){
        return down + height;
    }
    
    public void moveVertically() {
        // Change direction if the move would make the RoundHead
        // go past either the top or bottom edge of the viewer window.
        
        if (   (down + verticalStepSize <= TOP_EDGE)
            || (down + height + verticalStepSize >= BOTTOM_EDGE) ) {
			
            verticalStepSize = -1 * verticalStepSize;
			
        }

        down += verticalStepSize;		
    }
    
    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(over+10, down-10, 3, 10);
        g.fillRect(over+10, down-10, 5, 8);
        g.fillRect(over+10, down-10, 7, 6);
        
        g.setColor(Color.BLACK);
        g.fillRect(over+6, down, 10, 30);
        g.fillRect(over, down+10, 4, 15);
        g.fillRect(over+4, down+10, 16, 4);
        g.fillRect(over + 18, down+10, 4, 15);
        g.fillRect(over+6, down+30, 4, 15);
        g.fillRect(over+12, down+30, 4, 15);
        
        g.setColor(Color.GRAY);
        g.drawLine(over+11, down+2, over+11, down+8);
        g.drawLine(over+9, down+3, over+9, down+7);
        g.drawLine(over+13, down+3, over+13, down+7);
    }
    
}
