package org.example.homework.hw1;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Math18 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = ((abs(7.2 - 10 * x)) / (pow(pow(x,2) + exp(x), 1./3) * atan((4 * (x /3))/ (sqrt(pow(1.1, 3) + pow(x,2))))));
        System.out.println(y);
    }
}
