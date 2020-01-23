package Lab6;

/* 
    CSC 120 Lab 6
    Alec Barker
    10/4/17

    Declare, instantiate, and use RoundHead objects.

    Originally authored by various UMU CSIS Dept. faculty
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    private RoundHead firstOne, secondOne, rh1, rh2, rh3;
    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 500));
        setName("CSC 120 Lab # 6 -- RoundHeads");
        setUp();
        setBackground(Color.WHITE);

        firstOne  = new RoundHead(false, Color.GREEN, 480, 250, 30, -5, 50, "Joe");
        secondOne  = new RoundHead(true, Color.BLUE, 300, 150, -60, 25, 30, "Bob");
        rh1 = new RoundHead(true, Color.ORANGE, 540, 150, -6, 0, 50, "Karen");
        rh2 = new RoundHead(false, Color.BLACK, 400, 100, 10, -15, 20, "Fonoglio");
        rh3 = new RoundHead(true, Color.CYAN, 15, 200, -15, 1, 70, "Beatrice");

        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!


        firstOne.draw(g);
        secondOne.draw(g);
        rh1.draw(g);
        rh2.draw(g);
        rh3.draw(g);
		
		
    } // end of paintComponent()
    
    
    public void moveObjects() {
        
        firstOne.moveVertically();
        secondOne.moveVertically();
        rh1.moveVertically();
        rh2.moveVertically();
        rh3.moveVertically();
        
        firstOne.moveHorizontally();
        secondOne.moveHorizontally();
        rh1.moveHorizontally();
        rh2.moveHorizontally();
        rh3.moveHorizontally();
        
    } // end of moveObjects()
       
    public void changeObjectMoods() {
        
        firstOne.changeMood();
        secondOne.changeMood();
        rh1.changeMood();
        rh2.changeMood();
        rh3.changeMood();
        
    }
    
    public void growTheObjects() {
        firstOne.grow();
        secondOne.grow();
        rh1.grow();
        rh2.grow();
        rh3.grow();
    }
    
    public void shrinkTheObjects() {
        firstOne.shrink();
        secondOne.shrink();
        rh1.shrink();
        rh2.shrink();
        rh3.shrink();
    }
    
    
    
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
