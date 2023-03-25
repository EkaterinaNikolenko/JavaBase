package com.hillel.nikolenko.homeworks.homework18;

import java.util.Arrays;

public class Main {
    public static double averageOfArrayElements(int[] array) {
        if(array == null) return -1;
        if(array.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = sum / array.length;
        return average;
    }

    public static boolean isMatrixSquare(int[][] array) {
        if(array == null) return false;
        if(array.length == 0) return false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array.length != array[i].length) return false;
            }
        }
        return true;
    }
}
