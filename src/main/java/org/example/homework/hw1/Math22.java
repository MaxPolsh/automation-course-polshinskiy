package org.example.homework.hw1;

import static java.lang.Math.*;

public class Math22 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = asin(log(x)/(pow(x,2) + 5 * x + 1)) - (pow(x, 3.2) /28);
        System.out.println(y);
    }
}
