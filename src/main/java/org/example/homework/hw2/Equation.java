package org.example.homework.hw2;

import java.util.Random;

public class Equation {
    public static void main(String[] args) {
        double a = new Random().nextInt(10);
        double b = new Random().nextInt(10);
        double x = -b / a;
        System.out.println("a= " + a + "b= " + b);

        if (a == 0){
            System.out.println("Can't divide by zero");
        }
        else if (b == 0){
            System.out.println("x = 0");
        }
        else {
            System.out.println("x=" + x);
        }
    }
}
