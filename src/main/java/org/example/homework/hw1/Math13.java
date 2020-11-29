package org.example.homework.hw1;

import static java.lang.Math.*;

public class Math13 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = (pow(exp(-2 + x), 1./5)) * (1/(sqrt(pow(x,2) + pow(x,4) + log(abs(x - 3.14)))));
        System.out.println(y);
    }
}
