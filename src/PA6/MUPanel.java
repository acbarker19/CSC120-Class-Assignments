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
import java.util.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
    private Hero hero;
    private Obstacle[] obst;
    private Castle friendly, enemy;
    private Boolean heroHasFlag, youWon;
    private Random randGen;
    private Integer winCount;
    private Integer loseCount;

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Mount Union Java Program");
        setUp();
        setBackground(Color.WHITE);

        // 2. Instantiate objects here by calling "new":
        winCount = 0;
        loseCount = 0;
        
        hero = new Hero();
        
        obst = new Obstacle[6];
        
        friendly = new Castle(6, false);
        enemy = new Castle(566, true);
        
        heroHasFlag = false;
        
        youWon = false;
        
        randGen = new Random();
        
        for(Integer i = 0; i < obst.length; i++){
            Integer y = randGen.nextInt(431) + 20;
            
            obst[i] = new Obstacle((i*80)+120, y);
        }
        
    } // end of constructor
    
    public void hitDetection(){
        for(Integer i = 0; i < obst.length; i++){
            if(hero.isTouchingObstacle(obst[i]) == true){
                heroHasFlag = false;
                hero.hasFlag(heroHasFlag);
                friendly.flagRemoved();
                enemy.flagAdded();
                hero.reset();
                loseCount++;
            }
        }
    }
    
    public void capturingFlag(){
        if(hero.isInDoor(enemy) == true){
            heroHasFlag = true;
            hero.hasFlag(heroHasFlag);
            enemy.flagRemoved();
        }  
    }
    
    public void flagCaptured(){
        if(hero.hasFlag(heroHasFlag) == true && hero.isInDoor(friendly) == true){
            heroHasFlag = false;
            hero.hasFlag(heroHasFlag);
            friendly.flagAdded();
            youWon = true;
            winCount++;
        }
    }
    
    public void moveRight(){
        hero.right();
    }
    
    public void moveUp(){
        hero.up();
    }
    
    public void moveDown(){
        hero.down();
    }
    
    public void moveLeft(){
        hero.left();
    }
    
    public void moveObjects() {  
        for (Integer i = 0; i < obst.length; i++) {
            obst[i].moveVertically();
        }
    }
    
    public Boolean workingButtons(){
        Boolean answer;
        if(youWon == true){
            answer = false;
        }
        else{
            answer = true;
        }
        return answer;
    }
    
    public void reset(){
        youWon = false;
        friendly.flagRemoved();
        enemy.flagAdded();
        hero.reset();
    }
    
    public Integer wins(){
        return winCount;
    }
    
    public Integer losses(){
        return loseCount;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call methods of objects here:
        friendly.draw(g);
        enemy.draw(g);
        
        hero.draw(g);
        
        for(Integer i = 0; i < obst.length; i++){
            obst[i].draw(g);
        }
	
        if(youWon == true){
            g.setFont(new Font("TimesRoman", Font.PLAIN, 115));
            g.setColor(Color.MAGENTA);
            g.drawString("YOU WON!", 30, 100);
        }
		
    } // end of paintComponent()
    
    
    
       
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(false);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
