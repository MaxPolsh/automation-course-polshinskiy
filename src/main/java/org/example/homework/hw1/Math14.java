package org.example.homework.hw1;

import static java.lang.Math.*;
import static java.lang.Math.abs;

public class Math14 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = (sqrt(pow(sin(x/2),3)) + pow((exp(1.3*x + exp(-1.3 * x))),1./3)) * (1/abs(x * 2.5));
        System.out.println(y);
    }
}
