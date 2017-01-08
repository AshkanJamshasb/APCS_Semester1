
/**
 * Write a description of class RoachSimulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RoachSimulation{
    public static void main(String[] args) {
        RoachPopulation roach = new RoachPopulation(10);
        System.out.println("There are " + roach.getRoaches() + " many roaches to start with.");
        roach.Breed();
        System.out.println("There are " + roach.getRoaches() + " many roaches after breeding.");
        roach.spray(10);
        System.out.println("There are " + roach.getRoaches() + " many roaches after sprey.");
        roach.Breed();
        System.out.println("There are " + roach.getRoaches() + " many roaches after breeding.");
        roach.spray(10);
        System.out.println("There are " + roach.getRoaches() + " many roaches after sprey.");
        roach.Breed();
        System.out.println("There are " + roach.getRoaches() + " many roaches after breeding.");
        roach.spray(10);
        System.out.println("There are " + roach.getRoaches() + " many roaches after sprey.");
        roach.Breed();
        System.out.println("There are " + roach.getRoaches() + " many roaches after breeding.");
        roach.spray(10);
        System.out.println("There are " + roach.getRoaches() + " many roaches in the end.");
    }
}
