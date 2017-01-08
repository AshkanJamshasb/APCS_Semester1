import java.util.Scanner;
public class PP7_5 {
    public static void main(String[] args) {
        Seats seats = new Seats();
        Scanner scan = new Scanner(System.in);
        
        int seat;
        
        do{
            seats.printSeats();
            System.out.print("Pick a seat (0 to exit): ");
            seat = scan.nextInt();
            seats.changeSeat(seat);
        } while (seat != 0);
    }   
}

class Seats {
    int[][] seatChart = new int[9][10];
    Seats() {
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 10; j++) {
                if(i > 2 && j > 1 && j < 8) {
                    seatChart[i][j] = 20;
                }
                else {
                    seatChart[i][j] = 10;
                }
            }
        }
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 6) {
                    if(j < 2 || j > 7 ) {
                        seatChart[i][j] = 20;
                    }
                    else if (j < 4 || j > 5)  {
                        seatChart[i][j] = 30;
                    }
                    else {
                        seatChart[i][j] = 40;
                    }
                }
                if (i == 7) {
                    if(j < 1 || j > 8 ) {
                        seatChart[i][j] = 20;
                    }
                    else if (j < 3 || j > 6)  {
                        seatChart[i][j] = 30;
                    }
                    else if (j < 4 || j > 5)  {
                        seatChart[i][j] = 40;
                    }
                    else {
                        seatChart[i][j] = 50;
                    }                    
                }                
                if (i == 8) {
                    if(j < 1 || j > 8 ) {
                        seatChart[i][j] = 30;
                    }
                    else if (j < 2 || j > 7)  {
                        seatChart[i][j] = 40;
                    } else  {
                        seatChart[i][j] = 50;
                    }  
                }
            }
        }
    }

    public void printSeats() {
        for(int i = 0; i < seatChart.length; i++) {
            for(int j = 0; j < seatChart[i].length; j++) {
                System.out.print(seatChart[i][j]+ " ");
            }
            System.out.println();
        }
  	}
  	
  	public void changeSeat(int place) {
  	    boolean go = true;
        for(int i = 0; i < seatChart.length && go; i++) {
            for(int j = 0; j < seatChart[i].length && go; j++) {
                if(seatChart[i][j] == place) {
                    seatChart[i][j] = 00;
                    go = false;
                    break;
                }
            }
        }  	    
  	 }  	
}