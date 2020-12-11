package org.example.homework.hw4;

public class Distance {
    public static void main(String[] args) {
        System.out.println(converterMetersToInches(10));
        System.out.println(converterInchesToMeters(10));
        System.out.println(converterMilesToKilometers(5));
        System.out.println(converterKilometersToMiles(5));

    }

    public static double converterMetersToInches(double meters){
        return meters * 39.37;
    }

    public static double converterInchesToMeters(double inches){
        return inches / 39.37;
    }

    public static double converterMilesToKilometers(double miles){
        return miles * 1.609;
    }

    public static double converterKilometersToMiles(double kilometers){
        return kilometers * 1.609;
    }
}
