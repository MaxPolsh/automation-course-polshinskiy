package org.example.homework.hw1;

import static java.lang.Math.*;

public class Math10 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 0.33 * sqrt(abs(sin(x))) * pow((exp(0.12 * x)),1./3);
        System.out.println(y);
    }
}

