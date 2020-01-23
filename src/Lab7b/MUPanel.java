package Lab7b;

/*  CSC 120 Lab 7b
 *  
 *  Practice with loops and drawing shapes
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    
    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Mount Union Java Program");
        setUp();
        setBackground(Color.LIGHT_GRAY);

        // 2. Instantiate objects here by calling "new":
        

        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        Integer howMany = 15;
        Integer howManyS = 39;
        Integer howManyC = 150;
        
        Integer over, down, width, height, overs, downs, sizes,
                overc, downc, sizec;
        
        over = 15;
        down = 75;
        width = 15;
        height = 20;
        
        overs = 15;
        downs = 160;
        sizes = 150;
        
        overc = 15;
        downc = 440;
        sizec = 10;
        
        for (Integer count = 1; count <= howMany; count++ ) {
            
            if(count % 3 == 0){
                g.setColor(Color.BLUE);
            }
            else if(count % 3 == 1){
                g.setColor(Color.RED);
            }
            else if(count % 3 == 2){
                g.setColor(Color.GREEN);
            }
            g.fillRect(over, down, width, height);
            
            width = width + 3;
            over = over + width + 5;
            down = down - 10;
            height = height + 20;
            
        } // end for
        
        for (Integer count = 1; count <= howManyS; count++ ) {
            if(count % 2 == 0){
                g.setColor(Color.BLUE);
            }
            else{
                g.setColor(Color.CYAN);
            }
            g.drawRect(overs, downs, sizes, sizes);
            
            overs = overs + 2;
            downs = downs + 2;
            sizes = sizes - 4;
        }
        
        for (Integer count = 1; count <= howManyC; count++ ) {
            if(count % 7 == 0){
                g.setColor(Color.BLUE);
            }
            else if(count % 7 == 1){
                g.setColor(Color.CYAN);
            }
            else if(count % 7 == 2){
                g.setColor(Color.GREEN);
            }
            else if(count % 7 == 3){
                g.setColor(Color.YELLOW);
            }
            else if(count % 7 == 4){
                g.setColor(Color.ORANGE);
            }
            else if(count % 7 == 5){
                g.setColor(Color.RED);
            }
            else if(count % 7 == 6){
                g.setColor(Color.MAGENTA);
            }
            
            g.drawOval(overc, downc, sizec, sizec);
            
            sizec = sizec + 5;
            overc = overc + 5;
            downc = downc - 5;
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
