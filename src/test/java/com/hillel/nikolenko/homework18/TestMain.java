package com.hillel.nikolenko.homework18;

import com.hillel.nikolenko.homeworks.homework18.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static com.hillel.nikolenko.homeworks.homework18.Main.averageOfArrayElements;
import static com.hillel.nikolenko.homeworks.homework18.Main.isMatrixSquare;
import static org.junit.jupiter.api.Assertions.*;

public class TestMain {
    @Test
    void testMethod1() {
        int[] array = {1, 2, 3, 4, 5};
        double average = averageOfArrayElements(array);
        assertEquals(3, average);
    }
    @Test
    void testMethod2() {
        assertEquals(22, averageOfArrayElements(new int[]{11, 22, 33}));
    }
    @Test
    void testMethod3() {
        assertEquals(-20, averageOfArrayElements(new int[]{-10, -20, -30}));
    }
    @Test
    void testMethod4() {
        assertEquals(0, averageOfArrayElements(new int[]{}));
    }

    @Test
    void testMethod5() {
        assertEquals(-1, averageOfArrayElements(null));
    }
    @Test
    void testMethod6() {
        int[][] array2 = new int[3][3];
        assertTrue(isMatrixSquare(array2));
    }
    @Test
    void testMethod7() {
        assertFalse(isMatrixSquare(new int[5][3]));
    }
    @Test
    void testMethod8() {
        int[][] array = {
                {1, 2, 3, 4},
                {1, 2},
                {},
                {1, 2, 3}
        };
        assertFalse(isMatrixSquare(array));
    }

    @Test
    void testMethod9() {
        int[][] array = {
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4},
                {1, 2, 3, 4}
        };
        assertTrue(isMatrixSquare(array));
    }
    @Test
    void testMethod10() {
        assertFalse(isMatrixSquare(new int[][]{}));
    }
    @Test
    void testMethod11() {
        assertFalse(isMatrixSquare(null));
    }
}
