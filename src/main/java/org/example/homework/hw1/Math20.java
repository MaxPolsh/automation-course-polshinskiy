package org.example.homework.hw1;

import static java.lang.Math.*;
import static java.lang.Math.pow;

public class Math20 {
    public static void main(String[] args) {
        double x = 1.0;
        double y = ((pow(pow(log(x), 2), 1./3) + tan(cos(PI * x)))) * (abs((log(x/10.5) + 0.33)));
        System.out.println(y);
    }
}
