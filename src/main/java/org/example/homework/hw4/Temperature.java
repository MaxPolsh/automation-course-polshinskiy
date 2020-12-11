package org.example.homework.hw4;

public class Temperature {
    public static void main(String[] args) {
        System.out.println(converterCelsiusToKelvin(25));
        System.out.println(converterKelvinToCelsius(285));
        System.out.println(converterCelsiusToFahrenheit(20));
        System.out.println(converterFahrenheitToCelsius(45));

    }

    public static double converterCelsiusToKelvin(double celsius){
        return celsius + 273.15;
    }

    public static double converterKelvinToCelsius(double celsius){
        return celsius - 273.15;
    }

    public static double converterCelsiusToFahrenheit(double celsius){
        return (celsius * 9 / 5) + 32;
    }

    public static double converterFahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}


