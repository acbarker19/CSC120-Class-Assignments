package PA5;

/* CSC 120 Project # 5
 * Alec Barker
 * 11/1
 *
 * Project Description:
 *      Displays blue bars on the screen, which a user can increase with
 *      a button.
 * Acknowledgements:
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    private Integer howMany = 1;
    

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
        
        Integer x, y, over, down, width, height, size, start, arc;
        
        x = 10;
        y = 10;
        over = 325;
        down = 325;
        start = 0;
        arc = 90;
        
        
        for (Integer count = 1; count <= howMany; count++) {
            if(count == howMany){
                g.setColor(Color.RED);
                g.fillArc(x, y, over, down, start, arc);
            }
                    
            g.setColor(Color.BLACK);
            g.drawArc(x, y, over, down, start, arc);

            x = x + 10;
            over = over - 20;
            y = y + 10;
            down = down - 20;
                
            start = start + 90;
        } // end for

    } // end of paintComponent()
    
    public Integer getHowMany(){
        return howMany;
    }
    
    public void increaseReps(){
        howMany++;
    }
    
    public void resetRepsToOne(){
        howMany = 1;
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
