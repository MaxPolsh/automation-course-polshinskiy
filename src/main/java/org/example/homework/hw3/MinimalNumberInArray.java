package org.example.homework.hw3;

import java.util.Random;

public class MinimalNumberInArray {
    public static void main(String[]args){
        int[] arr = new int[12];
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(50);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("Minimum nunber:" + minValue );
    }
}
