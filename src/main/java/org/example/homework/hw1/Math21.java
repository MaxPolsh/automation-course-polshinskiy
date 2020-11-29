package org.example.homework.hw1;

import static java.lang.Math.*;

public class Math21 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = (pow(log(x), 1./4) + acos(x + 3)) * (1 / (abs(x + 2 * pow(x,2))));
        System.out.println(y);
    }
}
