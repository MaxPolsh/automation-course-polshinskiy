package org.example.homework.hw3;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;
        int N = 10;

        while (counter < N) {

           System.out.print(num1 + " ");

            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            counter = counter + 1;
        }
    }
}

