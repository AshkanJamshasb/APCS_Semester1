
/**
 * Write a description of class RoachPopulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoachPopulation {
    private int population = 0;
    
    public RoachPopulation(int inPop) {
        population = inPop;
    }
    
    public void Breed() {
        population *= 2;
    }
    
    public void spray(double percent) {
        population -= population*(percent*0.01);
    }
    
    public int getRoaches() {
       return population; 
    }
}