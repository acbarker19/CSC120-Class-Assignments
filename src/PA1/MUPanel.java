package PA1;

/* CSC 120 Project # 1
 * Alec Barker
 * 9/11/17
 *
 * Project Description:
 *  A program that draws a picture of two astronauts on the moon with stars in the background.
 *
 * Enhancements:
 *  New color created on the Astronauts (purple on the chest plate)
 *  New font type (Times New Roman) for the "Created by: Alec Barker" message and the name tags
 * 
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
    private Star s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15;
    private Astronaut astro1, astro2;
    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("CSC 120 PA1");
        setUp();
        setBackground(Color.BLACK);

        // 2. Instantiate objects here by calling "new":
        s1 = new Star(25, 25, 30);
        s2 = new Star(100, 100, 50);
        s3 = new Star(300, 300, 10);
        s4 = new Star(320, 250, 30);
        s5 = new Star(250, 50, 20);
        s6 = new Star(50, 325, 30);
        s7 = new Star(40, 200, 10);
        s8 = new Star(375, 100, 40);
        s9 = new Star(470, 10, 30);
        s10 = new Star(480, 350, 10);
        s11 = new Star(550, 200, 50);
        s12 = new Star(600, 90, 20);
        s13 = new Star(660, 130, 30);
        s14 = new Star(740, 35, 10);
        s15 = new Star(720, 280, 30);
        
        astro1 = new Astronaut("Tom", 150, 500, Color.RED, Color.CYAN);
        astro2 = new Astronaut("Mark", 550, 500, Color.BLUE, Color.YELLOW);
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call methods of objects here:
        
        //ground
        g.setColor(new Color(204,204,204));
        g.fillRect(0, 400, 800, 200);
        
        s1.draw(g);
        s2.draw(g);
        s3.draw(g);
        s4.draw(g);
        s5.draw(g);
        s6.draw(g);
        s7.draw(g);
        s8.draw(g);
        s9.draw(g);
        s10.draw(g);
        s11.draw(g);
        s12.draw(g);
        s13.draw(g);
        s14.draw(g);
        s15.draw(g);
        
        astro1.draw(g);
        astro2.draw(g);
        
        Font f1 = new Font("Times New Roman", Font.PLAIN, 12);
        setFont(f1);
        g.drawString("Created by: Alec Barker", 650, 580);
        
		
		
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
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
