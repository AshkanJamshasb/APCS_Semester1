public class CarTester { 
    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        System.out.println("50 miles/gallon");
        myHybrid.addGas(20);
        System.out.println("Add 20 gallons of gas");
        myHybrid.drive(100);
        System.out.println("Drives 100 miles");
        double gasLeft = myHybrid.getGasInTank();
        System.out.println("You have " + gasLeft + " gas left.");
    }
}