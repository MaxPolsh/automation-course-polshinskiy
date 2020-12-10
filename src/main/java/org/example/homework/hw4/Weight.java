package org.example.homework.hw4;

public class Weight {
    public static void main(String[] args) {
        System.out.println(converterPoundsToKilograms(25));
        System.out.println(converterKilogramsToPounds(25));
    }

    public static double converterPoundsToKilograms(double pounds){
        return pounds / 2.205;
    }

    public static double converterKilogramsToPounds(double kilograms){
        return kilograms * 2.205;
    }
}
