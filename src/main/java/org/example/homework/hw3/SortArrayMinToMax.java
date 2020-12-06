package org.example.homework.hw3;

import java.util.Arrays;

public class SortArrayMinToMax {
    public static void main(String[] args) {
        int[] array = {24, 31, 89, 67, 71, 21, 34, 87, 25, 18, 32};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
