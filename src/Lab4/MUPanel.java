package Lab4;

/*
    CSC 120
    Lab 4
  
    Alec Barker 

    Practice with arithmetic and muta.println
*/

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class MUPanel extends JPanel  {
    
    private ClothingItem myFavoriteShirts, otherShirts, bestJeans, jeans2,
                         blackShoes, flipFlops;
    
    private Coffee cup1, cup2, cup3, cup4, cup5;
    
    private MUTextArea muta;


    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("CSC 120 Lab # 4");
        setBackground(Color.WHITE);
        
        muta = new MUTextArea();
        muta.setBounds(10, 10, 780, 580);
        add(muta);
        
        myFavoriteShirts = new ClothingItem("Old Navy button-downs", "long-sleeved shirt", 25.50, 2);
        otherShirts    = new ClothingItem("A & F tees", "short-sleeved shirt", 35.00, 4);
        bestJeans       = new ClothingItem("Levis 550s", "pair of pants", 47.75, 3);
        jeans2          = new ClothingItem("Wranglers", "pair of pants", 28.90, 1);
        blackShoes      = new ClothingItem("Bass Loafers", "pair of shoes", 74.80, 1);
        flipFlops       = new ClothingItem("Orange Flip Flops", "pair of shoes", 9.95, 5);

        workWithClothingItems();

        
        cup1 = new Coffee("Tall", 12, 5.25);
        cup2 = new Coffee("Venti", 20, 8.75);
        cup3 = new Coffee("Grande", 16, 6.95);
        cup4 = new Coffee("Demi", 3, 2.79);
        cup5 = new Coffee("Short", 8, 3.99);
        
        workWithCoffeeObjects();
                
    } // end of MUPanel constructor
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.drawString("Look in Java Console for output", 10, 50);
        
    } // end of paintComponent()

    
    public void workWithClothingItems() {
        muta.println("My favorite shirts: " + myFavoriteShirts.toString() );
        muta.println("Other shirts I own: " + otherShirts.toString() );
        muta.println();
        muta.println("I have two kinds of jeans: " + bestJeans.toString() );
        muta.println("   ... and: " + jeans2.toString() );
        muta.println();
        muta.println("Going to class I wear: " + blackShoes.toString() );
        muta.println("For the beach I have: " + flipFlops.toString() );

        // how much did I spend on A & F tee shirts?
        Double totalSpent;
        totalSpent = otherShirts.getQuantity() * otherShirts.getPrice();
        muta.println();
        muta.println("I spent $" + totalSpent + " to buy all of my tee shirts");
        
        // reduce price of jeans2 object by 50%
        Double tempPrice;
        tempPrice = jeans2.getPrice();
        tempPrice = tempPrice * 0.50 ;
        jeans2.setPrice( tempPrice );
        muta.println();
        muta.println("If I had gotten my " + jeans2.getName()
                + " pants at a half-price sale, they would have cost $" + jeans2.getPrice());
        
        // change the type of the shoe objects
        blackShoes.setType("pair of dress shoes");
        flipFlops.setType("pair of casual shoes");
        muta.println();
        muta.println("Going to class I wear: " + blackShoes.toString() );
        muta.println("For the beach I wear: " + flipFlops.toString() );

    } // end of workWithClothingItems
    
    
    public void workWithCoffeeObjects() {
        muta.println("=======================================");
        muta.println("cup1: " + cup1.toString() );
        muta.println("cup2: " + cup2.toString() );
        muta.println("cup3: " + cup3.toString() );
        muta.println("cup4: " + cup4.toString() );
        muta.println("cup5: " + cup5.toString() );
        muta.println();
        muta.println("The price of " + cup3.getSize() + " is $" + (cup3.getPrice() - cup4.getPrice()) 
		        + " more than the price of " + cup4.getSize() );
        muta.println(cup2.getSize() + " contains " + (cup2.getOunces() - cup1.getOunces()) 
		        + " oz. more than " + cup1.getSize() + " contains");

        //*********************** 
        //* CALCULATE THE PRICE PER OUNCE OF cup2 AND cup4
        //* USE THE getPrice METHOD DO TO THIS
        //*********************** 

        Double pricePerOunce = 0.0;


        pricePerOunce = cup2.getPrice()/cup2.getOunces();
        muta.println("Price per ounce for " + cup2.getSize() + "=$ " + pricePerOunce );


        pricePerOunce = cup4.getPrice()/cup4.getOunces();
        muta.println("Price per ounce for " + cup4.getSize() + "=$ " + pricePerOunce );
		
        //*********************** 
        //* REDUCE THE PRICE OF THE cup1 and cup5 OBJECTS TO 25% OF WHAT THEY WERE
        //* USE THE setPrice AND getPrice METHODS DO TO THIS
        //*********************** 
	
        Double newCup1 = (cup1.getPrice() * .25);
        cup1.setPrice(newCup1);

        Double newCup5 = (cup5.getPrice() * .25);
        cup5.setPrice(newCup5);
				
		
        muta.println();
        muta.println("After reducing the prices,");
        muta.println("cup1: " + cup1.toString() );
        muta.println("cup2: " + cup2.toString() );
        muta.println("cup3: " + cup3.toString() );
        muta.println("cup4: " + cup4.toString() );
        muta.println("cup5: " + cup5.toString() );
		
    } // end of workWithCoffeeObjects

    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);   
        
    } // end of frame()

    public static void main(String args[]){new MUPanel().frame();}

}
