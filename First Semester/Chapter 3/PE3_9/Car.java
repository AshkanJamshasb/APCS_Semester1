
public class Car {
    double fuelLevel = 0;
    double milesDriven = 0;
    double mPg;
    Car(double eff) {
        mPg = eff;
    }
    
    public void drive(double milesDriven) {
        this.milesDriven = milesDriven;
    }
    
    public void addGas(double gas){
        fuelLevel += gas;
    }
    
    public double getGasInTank() {
        return fuelLevel - milesDriven*(1/mPg);
    }
}