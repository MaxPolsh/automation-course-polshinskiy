package org.example.homework.hw1;

import static java.lang.Math.*;
import static java.lang.Math.abs;

public class Math15 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = (abs(x * log(x) - 4) * sqrt(x)) * (1 / (pow(exp(4 * x - 1), 1./5)));
        System.out.println(y);
    }
}
