package org.example.homework.hw4;

public class Distance {
    public static void main(String[] args) {
        System.out.println(converterMetersToInches(10));
        System.out.println(converterInchesToMeters(10));
        System.out.println(converterMilesToKilometers(5));
        System.out.println(converterKilometersToMiles(5));

    }

    public static double converterMetersToInches(double meters){
        double inches = meters * 39.37;
        return inches;
    }

    public static double converterInchesToMeters(double inches){
        double meters = inches / 39.37;
        return meters;
    }

    public static double converterMilesToKilometers(double miles){
        double kilometers = miles * 1.609;
        return kilometers;
    }

    public static double converterKilometersToMiles(double kilometers){
        double miles = kilometers * 1.609;
        return miles;
    }
}
