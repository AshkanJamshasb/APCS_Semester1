public class FactorGenerator {
    int num;
    FactorGenerator(int numberToFactor) {
        num = numberToFactor;
    }
    
    public boolean hasMoreFactors(int n, int count) {
        return n%count==0;
    } 
    public int nextFactor (int i) {
        return i;
    }
}
