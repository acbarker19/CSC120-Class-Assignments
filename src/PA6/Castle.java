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

public class Castle {
    
    private Integer over, down, width, height;
    private Boolean hasFlag;
    
    public Castle(Integer x, Boolean flag){
        over = x;
        down = 210;
        width = 70;
        height = 60;
        hasFlag = flag;
    }
    
    public Integer getLeft(){
        return over + 20;
    }
    
    public Integer getRight(){
        return over + 50;
    }
    
    public Integer getTop(){
        return down + 5;
    }
    
    public Integer getBottom(){
        return down + height;
    }
    
    public void flagAdded(){
        hasFlag = true;
    }
    
    public void flagRemoved(){
        hasFlag = false;
    }
    
    public void draw(Graphics g){
        Color brown = new Color(630);
        
        g.setColor(Color.ORANGE);
        g.fillRect(over, down, 70, 60);
        g.fillRect(over, down-10, 10, 10);
        g.fillRect(over+20, down-10, 10, 10);
        g.fillRect(over+40, down-10, 10, 10);
        g.fillRect(over+60, down-10, 10, 10);
        
        g.setColor(Color.BLACK);
        g.fillRect(over+20, down+20, 30, 40);
        g.fillOval(over+20, down+5, 30, 30);
        
        if(hasFlag == true){
            g.setColor(brown);
            g.fillRect(over+34, down-40, 2, 40);
            
            g.setColor(Color.RED);
            g.fillRect(over+36, down-40, 5, 5);
            g.fillRect(over+41, down-35, 5, 5);
            g.setColor(Color.YELLOW);
            g.fillRect(over+36, down-35, 5, 5);
            g.fillRect(over+41, down-40, 5, 5);
            
            g.setColor(Color.BLACK);
            g.drawRect(over+36, down-40, 10, 10);
        }
    }
    
}
