package Lab10;

/* CSC 120 Lab 10
 * Samantha Student
 * Today's Date
 *
 * Project Description:
 * Writing methods that process arrays.
 *
 * Acknowledgements:
 */

import java.awt.*;
import javax.swing.*;

public class MUFrame extends JPanel {    
    
    private Car[] imported, domestic;
    
    public MUFrame() {
        setUpGUI();
        
        //  instantiate the array to hold 8 cars.
        
        imported = new Car[6];
        domestic = new Car[8];
        
        //  Instantiate the Car objects, one at a time.
        
        imported[0] = new Car(Color.GREEN,  101, 35, "Mitsubishi");
        imported[1] = new Car(Color.WHITE,   86, 40, "Toyota");
        imported[2] = new Car(Color.RED,    200, 16, "Jaguar");
        imported[3] = new Car(Color.YELLOW,  70, 25, "Honda");
        imported[4] = new Car(Color.BLUE,    62, 23, "Nissan");
        imported[5] = new Car(Color.RED,    110, 26, "Hyundai");
        
        domestic[0] = new Car(Color.WHITE,   80, 33, "Chrysler");
        domestic[1] = new Car(Color.YELLOW,  71, 40, "Ford");
        domestic[2] = new Car(Color.BLUE,    90, 13, "Cadillac");
        domestic[3] = new Car(Color.MAGENTA, 75, 34, "Chevy");
        domestic[4] = new Car(Color.WHITE,   64, 28, "Dodge");
        domestic[5] = new Car(Color.GREEN,  110, 24, "Buick");
        domestic[6] = new Car(Color.CYAN,    99, 17, "Lincoln");
        domestic[7] = new Car(Color.RED,     66, 21, "Jeep");

        //  Here we call the example methods.
        
        System.out.print("For the imported car array: ");
        displayFastestSpeed( imported );
        System.out.print("For the domestic car array: ");
        displayFastestSpeed( domestic );
        displayABlankLine();
        
        System.out.println("Fastest Domestic Car goes " + returnFastestSpeed( domestic ) + " miles per hour");
        System.out.println("Fastest Imported Car goes " + returnFastestSpeed( imported ) + " miles per hour");
        displayABlankLine();
        
        // Add lines below here to call the methods you write.

        displayAllCars(domestic);
        displayABlankLine();
        displayAllCars(imported);
        displayABlankLine();
       
        displayAverageMPGFor(domestic);
        displayAverageMPGFor(imported);
        displayABlankLine();
        
        System.out.println(returnWorstMPGFor(domestic));
        System.out.println(returnWorstMPGFor(imported));
        displayABlankLine();
        
        displayAboveAvgMPG(domestic);
        displayABlankLine();
        displayAboveAvgMPG(imported);
        displayABlankLine();
        
        System.out.println("Changing the mpg of the cars.");
        System.out.println("Before:");
        displayAllCars(domestic);
        displayABlankLine();
        displayAllCars(imported);
        displayABlankLine();
        changeMPGFor(domestic);
        changeMPGFor(imported);
        displayABlankLine();
        System.out.println("After:");
        displayAllCars(domestic);
        displayABlankLine();
        displayAllCars(imported);
        displayABlankLine();
        
        displayNumberOfRedCars(domestic);
        displayNumberOfRedCars(imported);
        displayABlankLine();
        System.out.println(returnNumberOfRedCars(domestic));
        System.out.println(returnNumberOfRedCars(imported));
        displayABlankLine();
        
        displayNameOfFastestCar(domestic);
        displayNameOfFastestCar(imported);
        displayABlankLine();
//        System.out.println(returnNameOfFastestCar(domestic));
//        System.out.println(returnNameOfFastestCar(imported));
        
    } // end of constructor
    
    public void displayAllCars( Car[] theArray ) {
        for(Integer i = 0; i < theArray.length; i++){
            System.out.println(theArray[i].toString());
        }
    } // end of displayAllCars()
    
    public void displayAverageMPGFor(Car[] theArray){
        Integer total = 0;
        Integer count = 0;
        for(Integer i = 0; i < theArray.length; i++){
            total += theArray[i].getMpg();
            count++;
        }
        System.out.println("The average mpg of all Car objects is: " + total * 1.0 / count);
    }
    
    public String returnWorstMPGFor(Car[] theArray){
        Integer minimum = 100;
        for(Integer i = 0; i < theArray.length; i++){
            if(theArray[i].getMpg() < minimum){
                minimum = theArray[i].getMpg();
            }
        }
        return "The lowest mpg of all Car objects is: " + minimum;
    }
    
    public void displayAboveAvgMPG(Car[] theArray){
        Integer total = 0;
        Integer count = 0;
        for(Integer i = 0; i < theArray.length; i++){
            total += theArray[i].getMpg();
            count++;
        }
        Double average = total * 1.0 / count;
        System.out.println("The average mpg for the Car objects is: " + average);
        System.out.println("The cars that have above average mpg are:");
        for(Integer i = 0; i < theArray.length; i++){
            if(theArray[i].getMpg() > average){
                System.out.println(theArray[i].toString());
            }
        }
    }
    
    public void changeMPGFor(Car[] theArray){
        for(Integer i = 0; i < theArray.length; i++){
            theArray[i].setMpg( theArray[i].getMpg() - 2);
        }
    }
    
    public void displayNumberOfRedCars(Car[] theArray){
        Integer count = 0;
        for(Integer i = 0; i < theArray.length; i++){
            if(theArray[i].getCarColor().equals(Color.RED)){
                count++;
            }
        }
        System.out.println("The number of red Car objects is: " + count);
    }
    
    public String returnNumberOfRedCars(Car[] theArray){
        Integer count = 0;
        for(Integer i = 0; i < theArray.length; i++){
            if(theArray[i].getCarColor().equals(Color.RED)){
                count++;
            }
        }
        return "The number of red Car objects is: " + count;
    }
    
    public void displayNameOfFastestCar(Car[] theArray){
        Integer maximum = 0;
        String name = "";
        for(Integer i = 0; i < theArray.length; i++){
            if(theArray[i].getMaxMph() > maximum){
                maximum = theArray[i].getMaxMph();
                name = theArray[i].getName();
            }
        }
        System.out.println("The faster Car object is: " + name);
    }
    
    public void displayABlankLine() {
        System.out.println();
    }  // end of displayABlankLine()
            
    // Example methods.
    public void displayFastestSpeed( Car[] theArray ) {
        
        Integer fastestSpeed = theArray[0].getMaxMph();
		
        for (Integer i = 0; i < theArray.length; i++) {
	
            Car currentCar = theArray[i];
            
            if ( currentCar.getMaxMph() > fastestSpeed ) {
			
                fastestSpeed = currentCar.getMaxMph();
				
            } // end if
			
        } // end for 
        
        System.out.println("The fastest car in this collection goes "
                            + fastestSpeed
                            + " miles per hour.");
    } // end of displayFastestSpeed()

    
    public Integer returnFastestSpeed( Car[] theArray ) {
    
        Integer fastestSpeed = theArray[0].getMaxMph();
		
        for (Integer i = 0; i < theArray.length; i++) {
	
            Car currentCar = theArray[i];
            
            if ( currentCar.getMaxMph() > fastestSpeed ) {
			
                fastestSpeed = currentCar.getMaxMph();
				
            } // end if
			
        } // end for 
        
        return fastestSpeed;
    } // end of returnFastestSpeed()
    
    
    // Add other methods here:


    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUpGUI() {
        setLayout(null);
        setName("CSC 120 Lab 10");
        setPreferredSize(new Dimension(570, 250));
        setBackground(Color.WHITE);

    } // end of setUpGUI
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setFont(new Font("Serif", Font.PLAIN, 18));
        g.drawString("Domestic Cars:", 6, 20);
        g.setFont(new Font("SansSerif", Font.PLAIN, 12));
        for (int i = 0;  i<domestic.length; i++) {
            domestic[i].draw(g, 6 + i*73, 40);
        } // end for
        g.setFont(new Font("Serif", Font.PLAIN, 18));
        g.drawString("Imported Cars:", 6, 150);
        g.setFont(new Font("SansSerif", Font.PLAIN, 12));
        for (int i = 0;  i<imported.length; i++) {
            imported[i].draw(g, 6 + i*73, 170);
        } // end for
    } // end of paintComponent
    
    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUFrame().frame();}

} // end of class MUPanel