package org.example.homework.hw1;

import static java.lang.Math.*;

public class Math11 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = (2 * PI * x - abs(sqrt(10.5 * x))) * (1 / (pow(pow(x,2),1./3) + 0.14));
        System.out.println(y);
    }
}
