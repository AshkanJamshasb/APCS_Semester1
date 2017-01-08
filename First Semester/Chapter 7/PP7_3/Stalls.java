import java.util.ArrayList;
public class Stalls {
    int numStalls;
    ArrayList<String> stalls = new ArrayList<String>();
    
    Stalls() {
        numStalls = 10;
        for(int i = 0; i < 10; i++) {
            stalls.add("_");
        }
    }    
    
    public void fillStall(int place) {
        stalls.set(place, "X");
    }
    
    public void findEmpty() {
        int place = 10;
        for(int i = 0; i < 10; i++) {
            if(stalls.get(i).equals("X")) {
                place = i;
                break;
            }
        }
        fillStall(place/2);
    }
    
    public boolean open(int place) {
        boolean open = false;
        if(stalls.get(place).equals("_")){
            open = true;
        }
        return open;
    }
    
    public void print() {
        for(int i = 0; i < 10; i++) {
            System.out.print(stalls.get(i) + " ");
        }
        System.out.println();
    }
}
