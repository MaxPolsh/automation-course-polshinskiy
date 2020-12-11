package org.example.homework.hw4;

public class Equation {
    public static void main(String[] args) {
       QuadraticEquation(2, 10, 2);

    }

    public static void QuadraticEquation(double a, double b, double c) {
        double d = (Math.pow(b, 2)) - (4 * a * c);
        double x1, x2;
        if (d < 0) {
            System.out.print("Уравнение не имеет решений");
        } else if (d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println("x = " + x1);
        } else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (a == 0) {
                System.out.println("На ноль делить нельзя ");
            } else {
                System.out.println("x1 =  " + x1 + "  x2 = " + x2);
            }
        }
    }
}

