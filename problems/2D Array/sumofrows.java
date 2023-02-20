import java.util.*;

public class sumofrows {

    public static void Sum(int nums[][]) {
        int sum =0;
       
            for (int j = 0; j < nums[0].length; j++) {
                sum += nums[1][j];
            }
        
        System.out.println(sum);
    }
  public static void main(String[] args) {
    
    int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

    System.out.println("The given Matrix is: ");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(nums[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println();

    Sum(nums);
  }  
}
