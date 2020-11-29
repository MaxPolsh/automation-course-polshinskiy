package org.example.homework.hw1;

import static java.lang.Math.*;

public class Math16 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = (pow((exp(2 * x) * sqrt(x) - ((x + 0.33)/x)), 1./3)) * (abs(cos(2.5 * x)));
        System.out.println(y);
    }
}
