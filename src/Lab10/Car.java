package Lab10;

/*
	A Car class for an array of Car objects.
        Revised slightly - Fall, 2008
*/

import java.awt.*;

public class Car {
    
    private Integer size; //size represents the width of the car
    private Color carColor;
    private Integer maxMph;
    private Integer mpg;
    private String name;

    public Car (Color c, Integer max, Integer m, String n) {
        carColor = c;
        maxMph = max;
        mpg = m;
        name = n;
        size = 40; //all cars are 40 pixels wide
    } // end of constructor

    
    //These are the "getters" that allow MUPanel to "get" properties of a Car
    public Integer getMaxMph() {
        return maxMph;
    }
    
    public Color getCarColor() {
        return carColor;
    }
    
    public Integer getMpg() {
        return mpg;
    }
    
    public String getName() {
        return name;
    }

    //These are the "setters" that allow MUPanel to "set", or change properties of a Car
    public void setMaxMph(Integer max) {
        maxMph = max;
    }
    
    public void setCarColor(Color c) {
        carColor = c;
    }
    
    public void setMpg(Integer m) {
        mpg = m;
    }
    
    public void setName(String n) {
        name = n;
    }
    

    public String toString() {
        return name + " " + maxMph + " " + mpg + " " + carColor;        
    } // end of toString

	
	
    public void draw(Graphics g, Integer over, Integer down) {
        //tires
        g.setColor(Color.black);
        g.fillOval(over+4, down+10, 5, 8);
        g.fillOval(over+32, down+10, 5, 8);

        //top of car
        g.setColor(carColor);
        g.fillRoundRect(over+5, down-8, size-10, size/4,5,5);
        g.setColor(Color.black);
        g.drawRoundRect(over+5, down-8, size-10, size/4, 5, 5);

        //bottom of car
        g.setColor(carColor);
        g.fillRoundRect(over, down, size, size/3,8,8);
        g.setColor(Color.black);
        g.drawRoundRect(over, down, size, size/3, 8, 8);

        //steering wheel and headlights
        g.setColor(Color.black);
        g.drawArc(over + size/2, down-3, 12, 12, 40, 100);
        g.setColor(Color.YELLOW);
        g.fillOval(over + size/5-2, down + 4, 4,4);
        g.fillOval(over + 4*size/5-2, down + 4, 4,4);
        g.setColor(Color.GRAY);
        g.drawOval(over + size/5-2, down + 4, 4,4);
        g.drawOval(over + 4*size/5-2, down + 4, 4,4);

        //printed information under the car drawings
        g.setColor(Color.BLACK);
        g.drawString(name,over, down+32);
        g.drawString("max "+maxMph,over, down+48);
        g.drawString("mpg "+mpg,over, down+64);
    } // end of draw

} //  end of class Car
