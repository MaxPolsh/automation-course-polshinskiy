package org.example.homework.hw2;

import java.util.Random;

public class NumberComparator {
    public static void main(String[] args) {
        int x = new Random().nextInt(50);
        int y = new Random().nextInt(50);
        System.out.println("x="+ x + "y=" + y);

        if (x > y){
            System.out.println("The number x has the greatest value");
        }
        else if (x < y) {
            System.out.println("The number x has the greatest value");
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
