
/**
 * Write a description of class Critter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Critter {
    private int xMove = 0;
    private int yMove = 0;
    private int numMoves = 0;
    
    public Critter(int x, int y) {
        xMove = x;
        yMove = y;
    }
    
    public void moveUp() {
        yMove++;
        numMoves++;
        System.out.println("The critter moves up one");
    }
    
    public void moveDown() {
        yMove--;
        numMoves++;
        System.out.println("The critter moves down one");
    }
    
    public void moveRight() {
        xMove++;
        numMoves++;
        System.out.println("The critter moves right one");
    }
    
    public void moveLeft() {
        xMove--;
        numMoves++;
        System.out.println("The critter moves left one");
    }
    
    public String coordinates() {
        return "(" + xMove + ", " + yMove + ")";
    }
    
    public double fromOrigin() {
        return Math.sqrt((yMove*yMove)+(xMove*xMove)); 
    }
    
    public int numMoves() {
        return numMoves;
    }
    
}
