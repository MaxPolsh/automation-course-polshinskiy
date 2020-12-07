package org.example.homework.hw3;

import java.util.Scanner;

public class AllNumbers {
    public static void main(String[] args) {

        char array[] = new char[177];
        Scanner input = new Scanner(System.in);
        System.out.println("Insert array elements:");
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (i >= 50 && i <= 177) {
                System.out.print(i);
            }
        }
    }
}

