
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car {
    private double costOfCar;
    private double milesPerYear;
    private double gasPrice;
    private double eff;
    private double resale;
    
    public void setCost(double c){
        costOfCar = c;
    }
    
    public void setMiles(double m){
        milesPerYear = m;
    }
    
    public void setGas(double g){
        gasPrice = g;
    }
    
    public void setEff(double e){
        eff = e;
    }

    public void setResale(double r){
        resale = r;
    }
    
    public double totalPrice(){
        double h = 15000/40;
        return (costOfCar + h*gasPrice) - resale;
    }
}

