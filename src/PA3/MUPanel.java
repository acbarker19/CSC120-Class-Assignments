package PA3;

/* CSC 120 Project # 3
 * Alec Barker
 * 10/11/17
 *
 * Project Description:
 *      Shows parrots in a jungle or cage. Buttons allow you to cycle through
 *      the colors the parrots can be, if they are flying or not, and the 
 *      setting.
 * Acknowledgements:
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
    
    private Background bg;
    private Parrot p1, p2, p3;

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Mount Union Java Program");
        setUp();
        setBackground(Color.WHITE);

        // 2. Instantiate objects here by calling "new":
        
        bg = new Background(true);
        
        p1 = new Parrot(Color.RED, 200, true, 50, 70);
        p2 = new Parrot(Color.CYAN, 150, false, 500, 200);
        p3 = new Parrot(Color.GREEN, 100, true, 255, 300);
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call methods of objects here:

        bg.draw(g);
        
        p1.draw(g);
        p2.draw(g);
        p3.draw(g);
		
		
    } // end of paintComponent()
    
    
    public void changeObjectColors() {
        p1.changeColor();
        p2.changeColor();
        p3.changeColor(); 
    }
    
    public void changeFlight() {
        p1.changeIsFlying();
        p2.changeIsFlying();
        p3.changeIsFlying();
    }
    
    public void changeBackground() {
        bg.changeBG();
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
