import java.util.*;

public class Noof7 {

public static void count(int matrix[][]) {
    int c=0;
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j]==7){
                c++;
            }
        }
    }
    System.out.println("The number of times 7 is: "+c);
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows of Matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of Matrix: ");
        int columns = sc.nextInt();

        System.out.println("Enter the Elements: ");
        int matrix[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        count(matrix);
    }
}
