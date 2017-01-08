public class PP1_3 {
    public static void main(String[] args) {
        double pi = 0;
        for(int i = 1; i < 1000001; i+=2){
            pi += 1.0/(((i-1)%4==0)?i:(-i));
        }  
        System.out.printf("pi is equal to: %6.5f", (4*pi));
    }
}
