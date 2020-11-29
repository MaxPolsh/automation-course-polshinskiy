package org.example.homework.hw1;

import static java.lang.Math.*;

public class Math9 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 1.1*exp(-x)+abs(cos(sqrt(PI*x)))-0.375;
        System.out.println(y);
    }
}
