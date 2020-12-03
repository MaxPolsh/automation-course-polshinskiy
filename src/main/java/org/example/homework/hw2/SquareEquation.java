package org.example.homework.hw2;

import java.util.Scanner;

public class SquareEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c, d;
        double x1, x2;

        System.out.print(" a: ");
        a = in.nextDouble();
        System.out.print(" b: ");
        b = in.nextDouble();
        System.out.print(" c: ");
        c = in.nextDouble();
        d = Math.pow(b, 2) - (4 * a * c);

        System.out.println("Дискриминант = " + d);

        if(d < 0) {
            System.out.print("Уравнение не имеет решений");
        }
        else
        if(d == 0) {
            x1 = (-b) / (2 * a);
            System.out.println ("x = " + x1);
        }
        else {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (a == 0) {
                System.out.println("На ноль делить нельзя ");
            }
            else {
                System.out.println("x1 =  " + x1 + "  x2 = " + x2);
            }
        }
    }
}
