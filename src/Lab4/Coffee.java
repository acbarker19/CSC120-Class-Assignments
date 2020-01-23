package Lab4;

/**
 *
 * @author barkera2020
 */
public class Coffee {
    private String size;
    private Integer ounces;
    private Double price;
    
    //constructor
    public Coffee(String s, Integer weight, Double cost){
        size = s;
        ounces = weight;
        price = cost;
    }
    
    //getters
    public String getSize(){
        return size;
    }
    
    public Integer getOunces(){
        return ounces;
    }
    
    public Double getPrice(){
        return price;
    }
    
    //setters
    public void setSize(String s){
        size = s;
    }
    
    public void setOunces(Integer weight){
        ounces = weight;
    }
    
    public void setPrice(Double cost){
        price = cost;
    }
    
    //toString
    public String toString(){
        String sentence = "A Coffee object with size: " + size + " (" + ounces +
                " oz.) and price = $" + price;
        return sentence;
    }
    
}
