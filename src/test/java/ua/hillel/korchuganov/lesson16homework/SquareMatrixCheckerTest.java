package ua.hillel.korchuganov.lesson16homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareMatrixCheckerTest {
    @Test
    public boolean testIsSquareMatrix() {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] emptyMatrix = {};
        int[][] nullMatrix = null;

        Assertions.assertTrue(testIsSquareMatrix());
        Assertions.assertFalse(testIsSquareMatrix());
        return false;
    }
}