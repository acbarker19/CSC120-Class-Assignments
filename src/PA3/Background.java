package PA3;

/*
    Alec Barker
    10/16/17

    Description:
        Draws the background in the MUFrame, which can be changed to a jungle
        or a cage.
*/

import java.awt.*;

public class Background {
    
    private Boolean isJungle;
    
    public Background(Boolean j) {
        isJungle = j;
    }
    
    public void draw(Graphics g) {
        Color brownColor = new Color(102, 34, 0);
        
        if (isJungle.equals(true)) {
            Color greenBG = new Color(41, 163, 41);
            Color greenLeaves = new Color(20, 82, 20);
            
            g.setColor(greenBG);
            g.fillRect(0, 0, 1000, 1000);
            
            g.setColor(brownColor);
            g.fillRect(0, 0, 20, 1000);
            g.fillRect(60, 0, 50, 1000);
            g.fillRect(150, 0, 50, 1000);
            g.fillRect(250, 0, 50, 1000);
            g.fillRect(380, 0, 50, 1000);
            g.fillRect(480, 0, 50, 1000);
            g.fillRect(560, 0, 50, 1000);
            
            g.setColor(greenLeaves);
            g.fillOval(-20, -20, 150, 70);
            g.fillOval(100, -20, 150, 70);
            g.fillOval(220, -20, 150, 70);
            g.fillOval(340, -20, 150, 70);
            g.fillOval(460, -20, 150, 70);
            g.fillOval(580, -20, 150, 70);
        }
        else {
            Color purpleBG = new Color(204, 153, 255);
            
            g.setColor(purpleBG);
            g.fillRect(0, 0, 1000, 1000);
            
            g.setColor(Color.BLACK);
            g.drawLine(50, 0, 50, 1000);
            g.drawLine(100, 0, 100, 1000);
            g.drawLine(150, 0, 150, 1000);
            g.drawLine(200, 0, 200, 1000);
            g.drawLine(250, 0, 250, 1000);
            g.drawLine(300, 0, 300, 1000);
            g.drawLine(350, 0, 350, 1000);
            g.drawLine(400, 0, 400, 1000);
            g.drawLine(450, 0, 450, 1000);
            g.drawLine(500, 0, 500, 1000);
            g.drawLine(550, 0, 550, 1000);
            g.drawLine(600, 0, 600, 1000);
            
            g.drawLine(0, 50, 1000, 50);
            g.drawLine(0, 450, 1000, 450);
            
            g.drawLine(524, 0, 524, 150);
            g.drawLine(525, 0, 525, 150);
            g.drawLine(526, 0, 526, 150);
            
            g.drawLine(524, 150, 574, 355);
            g.drawLine(525, 150, 575, 355);
            g.drawLine(526, 150, 576, 355);
            
            g.drawLine(524, 150, 474, 355);
            g.drawLine(525, 150, 475, 355);
            g.drawLine(526, 150, 476, 355);
            
            g.setColor(brownColor);
            g.fillRect(460, 355, 128, 15);
        }
    }
    
    public void changeBG() {
        isJungle = !isJungle;
    }
    
}
