package ua.hillel.korchuganov.lesson16homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.hillel.korchuganov.lessons.lesson16homework.ArrayOperations;

public class ArrayOperationsTest {

    int[] array = {1, 2, 3, 4, 5};

    @Test
    public void testAverage1() {
        Assertions.assertEquals(3.0, ArrayOperations.average(array), 0.0001);
    }

    @Test
    public void testAverage2() {
        Assertions.assertEquals(0.0, ArrayOperations.average(new int[]{}), 0.0001);
    }
}
