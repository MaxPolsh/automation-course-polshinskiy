package org.example.homework.hw1;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Math25 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = pow((log(acos(abs(pow(x, 3.4) + 2.5 * pow(x, 1.2) - 0.7) / pow(exp(2.5 * x), 1./3)))), 1./4) + 1;
        System.out.println(y);
    }
}
