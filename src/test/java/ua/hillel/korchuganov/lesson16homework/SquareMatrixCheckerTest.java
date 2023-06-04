package ua.hillel.korchuganov.lesson16homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.hillel.korchuganov.lessons.lesson16homework.SquareMatrixCheker;

import static ua.hillel.korchuganov.lessons.lesson16homework.SquareMatrixCheker.isSquareMatrix;

public class SquareMatrixCheckerTest {

    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] emptyMatrix = {};
        int[][] nullMatrix = null;

        Assertions.assertTrue(isSquareMatrix(squareMatrix));
        Assertions.assertFalse(isSquareMatrix(nonSquareMatrix));
        Assertions.assertFalse(isSquareMatrix(emptyMatrix));

    }}
