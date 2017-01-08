public class CritterTester {
    public static void main(String[] args) {
        Critter crit = new Critter(2, 2);
        
        crit.moveUp(); //1
        crit.moveLeft();//2
        crit.moveLeft();//3
        crit.moveUp();//4
        crit.moveRight();//5
        crit.moveRight();//6
        crit.moveUp();//7
        crit.moveDown();//8
        crit.moveRight();//9
        crit.moveDown();//10
        crit.moveUp();
        
        System.out.println("\nThe critter has moved " + crit.numMoves() + " times.");
        System.out.println("The critter has a distance of " + crit.fromOrigin() + " from the origin.");
        System.out.println("The critter's position is " + crit.coordinates() + ".");
    }
}
