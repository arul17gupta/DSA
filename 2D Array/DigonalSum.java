import java.util.*;

import javax.swing.plaf.synth.SynthStyleFactory;

public class DigonalSum {

    public static int digonalSum(int matrix[][]) {
        int sum = 0;

        /*
          if(i==j){
          for (int j = 0; j < matrix[0].length; j++) {
          //primary diagonal
          sum+= matrix[i][j];
         }
          
          //secondary diagonal
          if(i+j == matrix.length-1){
          for (int i = 0; i < matrix.length; i++) {
          sum+=matrix[i][j];
          }
         }
         */

         for (int i = 0; i < matrix.length; i++) {
            //pd
          sum +=matrix[i][i];  
          //sd
          if(i!= matrix.length-1-i)
          sum +=matrix[i][matrix.length-1-i];
         }
        return sum;
    }


    
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 },
        { 13, 14, 15, 16 }
    };
   System.out.println(digonalSum(matrix));  
}

}
