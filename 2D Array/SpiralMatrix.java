import java.util.*;


public class SpiralMatrix {

    public static void Spiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startRow <= endrow && startCol <= endcol) {
            // top
            for (int i = startCol; i <= endcol; i++) {
                System.out.print(matrix[startRow][i] + "");
            }

            // right
            for (int i = startRow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");
            }

            // bottom
            for (int i = endcol - 1; i >= startCol; i--) {
                if (startRow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][i] + " ");
            }

            // left
            for (int i = endrow - 1; i >= startRow + 1; i--) {
                if (startCol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endcol--;
            endrow--;
        }

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        Spiral(matrix);
    }
}
