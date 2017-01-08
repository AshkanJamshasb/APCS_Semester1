public class ArrayMethods {
    private int[] values, initial;
    public ArrayMethods(int[] initialValues) {
        values = initialValues;
        initial = new int[initialValues.length];
    }
    
    public void backup() {
        for (int i = 0; i < values.length; i++) {
            initial[i] = values[i];
        }  
    }
    
    public void reset() {
        for (int i = 0; i < values.length; i++) {
            values[i] = initial[i];
        }        
    }
    
    public void swapFirstAndLast() {
        int temp = values[0];
        values[0] = values[6];
        values[6] = temp;
    }
    
    public void shiftRight() {
        int temp = values[values.length - 1];
        for (int i = values.length - 1; i >= 0; i--) {
            if (i == 0) {
                values[0] = temp;
            } else {
                values[i] = values[i-1];
            }
        }
    }
    
    public void replaceEvenWithZero() {
        for (int i = 0; i < values.length; i++) {
            if (values[i]%2 == 0) {
                values[i] = 0;
            }
        }
    }
    
    public void biggerNum() {
        for (int i = 1; i < values.length - 1; i++) {
            if (values[i] < values[i-1]) {
                values[i] = values[i-1];
            }
            if (values[i] < values[i+1]) {
                values[i] = values[i+1];
            }
        }   
    }
    
    public void removeMiddle() {
        for (int i = values.length/2 + 1; i < values.length-1; i++) {
            values[i] = values[i+1];
        }
    }
    
    public void evenToFront() {
        int oddTemp, minus = 1;
        for (int i = 0; i < values.length-minus; i++) {
            if (values[i]%2 != 0) {
                oddTemp = values[i];
                minus++;
                for (int j = i; j < values.length-1; j++) {
                    values[j] = values[j+1];
                }
                values[values.length-1] = oddTemp;
                i--;
            }
        }
    }
}