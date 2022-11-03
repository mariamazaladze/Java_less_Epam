package less4.arrays.homework;

import java.util.Arrays;

/**
 * სპირალისებრივ დავახვიოთ
 * Description
 * Please, proceed to Spiral class and implement its static method:
 * int[][] spiral(int rows, int columns)
 * Return a two-dimensional array coming in the form of a table and containing numbers from 1 up to rows * columns.
 * The size of the table will be specified by the given parameters.
 * Numbers fill the "table" clockwise from the top-level corner in a spiral manner.
 * For example, for parameter values (3, 4), the output array should be:
 * 1  2  3  4
 * 10 11 12  5
 * 9  8  7  6
 */
public class Exercise6_Spiral {
    public static void main(String[] args) {
        int[][] expected = new int[][]{{1, 2, 3, 4}, {10, 11, 12, 5}, {9, 8, 7, 6}};
        spiral(3, 4);
    }

    static int[][] spiral(int rows, int columns) {

        int mat[][] = new int[rows][columns];

        int counter = 1;
        int startCol = 0;
        int endCol = columns - 1;
        int startRows = 0;
        int endRows = rows - 1;

        // ბოლო როუ მეტია საწყისის როუზე     && ბოლო ქოლუმი მეტია საწყისი ქოლუმი
        while (endRows >= startRows && endCol >= startCol) {
                 //გაირბინე ქოლუმი

            for (int i = startCol; i <= endCol; i++) {
                //დაითვალე რამდენია
                mat[startRows][i] = counter;
                counter++;
            }
            startRows++;
            for (int j = startRows; j <= endRows; j++) {
                mat[j][endCol] = counter;
                counter++;
            }
            endCol--;

            if (startRows > endRows) {
                break;
            }
            for (int l = endCol; l >= startCol; l--) {
                mat[endRows][l] = counter;
                counter++;
            }
            endRows--;

            if (startCol > endCol) {
                break;
            }
            for (int y = endRows; y >= startRows; y--) {
                mat[y][startCol] = counter;
                counter++;
            }
            startCol++;
        }
        System.out.println(Arrays.deepToString(mat));
        return mat;
    }
}