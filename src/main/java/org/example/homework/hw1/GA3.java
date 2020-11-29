package org.example.homework.hw1;

import java.util.Scanner;

public class GA3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the mark on test:");
        double mark = in.nextDouble();
        System.out.print("Enter the mark on test total:");
        double test = in.nextDouble();
        double percentege = (mark / test) * 100;
        System.out.println(percentege + "%");
    }
}
