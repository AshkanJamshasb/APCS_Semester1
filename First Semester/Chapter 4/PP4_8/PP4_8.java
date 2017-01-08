public class PP4_8 {
    public static void main(String[] args) {
        int due = 1789;
        int given = 2000;
        int change;
        int dollars, quarters, dimes, nickles, pennies;
        System.out.println("The amount due was $17.89 and the amount given was $20");
        
        change = given - due;
        
        dollars = change / 100;
        change -= dollars*100;
        quarters = change / 25;
        change -= quarters*25;
        dimes = change / 10;
        change -= dimes*10;
        nickles = change / 5;
        change -= nickles*5;
        pennies = change;
        
        System.out.println("Dollars: " + dollars + ", quarters: " + quarters + ", dimes: " + dimes +" nickles: " + nickles + ", pennies: " + pennies);
        
    }
}
