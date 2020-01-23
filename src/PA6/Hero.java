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

public class Hero {
    
    private Integer over, down;
    private Integer width = 22; 
    private Integer height = 30;
    private Boolean holdingFlag;
    
    public Hero(){
        over = 30;
        down = 225;
        holdingFlag = false;
    }
    
    public Boolean isTouchingObstacle( Obstacle obst ) {
        Boolean answer;

        if ( obst.getRight() < over ) {
            answer = false;
        }
        else if ( obst.getLeft() > over + width ) {
            answer = false;
        }
        else if ( obst.getBottom() < down ) {
            answer = false;
        }
        else if ( obst.getTop() > down + height ) {
            answer = false;
        }
        else {
            answer = true;
        }

        return answer;
    }
    
    public Boolean isInDoor(Castle castle) {
        Boolean answer;

        if (castle.getRight() < over ) {
            answer = false;
        }
        else if (castle.getLeft() > over + width ) {
            answer = false;
        }
        else if (castle.getBottom() < down ) {
            answer = false;
        }
        else if (castle.getTop() > down + height ) {
            answer = false;
        }
        else {
            answer = true;
        }

        return answer;
    }
    
    public Boolean hasFlag(Boolean captured){
        if(captured == true){
            holdingFlag = true;
        }
        else if(captured == false){
            holdingFlag = false;
        }
        
        return holdingFlag;
    }
    
    public void reset(){
        holdingFlag = false;
        over = 30;
        down = 225;
    }
    
    public void right(){
        if(over <= 570){
            over = over + 20;
        }
    }
    
    public void up(){
        if(down >= 20){
            down = down - 20;
        }
    }
    
    public void down(){
        if(down <= 440){
            down = down + 20;
        }
    }
    
    public void left(){
        if(over >= 30){
            over = over - 20;
        }
    }
    
    public void draw(Graphics g){
        Color brown = new Color(630);
        
        g.setColor(Color.RED);
        g.fillRect(over+10, down-10, 3, 10);
        g.fillRect(over+10, down-10, 5, 8);
        g.fillRect(over+10, down-10, 7, 6);
        
        g.setColor(Color.GRAY);
        g.fillRect(over+6, down, 10, 30);
        g.fillRect(over, down+10, 4, 15);
        g.fillRect(over+4, down+10, 16, 4);
        g.fillRect(over + 18, down+10, 4, 15);
        g.fillRect(over+6, down+30, 4, 15);
        g.fillRect(over+12, down+30, 4, 15);
        
        g.setColor(Color.BLACK);
        g.drawLine(over+11, down+2, over+11, down+8);
        g.drawLine(over+9, down+3, over+9, down+7);
        g.drawLine(over+13, down+3, over+13, down+7);
        
        if(holdingFlag == true){
            g.setColor(brown);
            g.fillRect(over+19, down-20, 2, 45);
            
            g.setColor(Color.RED);
            g.fillRect(over+21, down-20, 5, 5);
            g.fillRect(over+26, down-15, 5, 5);
            g.setColor(Color.YELLOW);
            g.fillRect(over+21, down-15, 5, 5);
            g.fillRect(over+26, down-20, 5, 5);
            
            g.setColor(Color.BLACK);
            g.drawRect(over+21, down-20, 10, 10);
        }
    }
    
}
