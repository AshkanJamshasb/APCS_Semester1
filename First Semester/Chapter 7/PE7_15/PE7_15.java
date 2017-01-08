import java.util.Scanner;
public class PE7_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[4][4];
        int sumRStag = 0, sumR = 0, sumCStag = 0, sumC = 0, sumDagP = 0, sumDagN = 0; 
        boolean failure = false; 
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Enter row " + (i+1) + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        
        //Print matrix
        System.out.println("\n::MATRIX::");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                sumCStag += matrix[i][j];
                sumRStag += matrix[j][i];
                sumC += matrix[i][j];
                sumR += matrix[j][i];
            }
            sumDagP += matrix[i][3-i];
            sumDagN += matrix[i][i];
            if (sumCStag != sumC || sumRStag != sumR) {
                    failure = true;
            }
            sumCStag = sumRStag = sumC = sumR = 0;
        }
            sumDagP += matrix[3][0];
            sumDagN += matrix[3][3];
            
        if(failure || sumDagP != sumDagN) {
            System.out.println("Does not make a magic square.");
        } else {
            System.out.println("Makes a perfect sqare.");
        }
        }
    }

