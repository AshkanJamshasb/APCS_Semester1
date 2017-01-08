public class DataSet {
    double sum;
    double sumSquared;
    int count;
    double standDevi;
    double average;
    
    DataSet () {
        int sum = 0;
        int standDevi = 0;
        int count = 0;
    }
    
    public void add(double value) {
        sum += value;       
        sumSquared += Math.pow(value, 2);
        count++;
    }
    
    public double getStandardDeviation() {
        return standDevi = Math.sqrt(((sumSquared) - ((1.0/sum)*(Math.pow(sum, 2))))/(count - 1)); 
    }
    
    public double getAverage() {
        return sum/count;
    }
}
