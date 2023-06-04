package ua.hillel.korchuganov.lessons.lesson16homework;

public class SquareMatrixCheker {
    public static boolean isSquareMatrix(int[][] matrix) {
        int rows = matrix.length;

        if (rows == 0) {
            return false;
        }

        for (int[] row : matrix) {
            if (row.length != rows) {
                return false;
            }
        }

        return true;
    }
}
