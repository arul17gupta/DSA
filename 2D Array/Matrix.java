import java.util.*;

public class Matrix {
    public static boolean Search(int matrix[][]) {
        System.out.println("Enter the Key: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + (i + 1) + "," + (j + 1) + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
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

        System.out.println();
        System.out.println("The given Matrix is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        Search(matrix);
    }
}
