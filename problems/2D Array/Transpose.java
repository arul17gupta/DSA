import java.util.*;

public class Transpose {

    public static void transpose(int matrix[][], int nums[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                nums[j][i] = matrix[i][j];
            }
        }
        printMatrix(nums);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows of Matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of Matrix: ");
        int columns = sc.nextInt();

        int nums[][] = new int[columns][rows];

        System.out.println("Enter the Elements: ");
        int matrix[][] = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        printMatrix(matrix);
        System.out.println();
        transpose(matrix, nums);
    }
}
