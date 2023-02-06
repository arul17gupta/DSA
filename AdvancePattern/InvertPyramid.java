import java.util.*;


public class InvertPyramid {


public static void InvertPyramid(int row, int col){
    for (int i = row; i >= 1; i--) {
        for (int j = 1 ; j <= col; j++) {
            if(j<i){
                System.out.print(" ");
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
    }
}






    public static void main(String[] args) {
        InvertPyramid(4, 4);
        
    }
    
}
