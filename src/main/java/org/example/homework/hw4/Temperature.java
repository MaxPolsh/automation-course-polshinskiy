package org.example.homework.hw4;

public class Temperature {
    public static void main(String[] args) {
        System.out.println(converterCelsiusToKelvin(25));
        System.out.println(converterKelvinToCelsius(285));
        System.out.println(converterCelsiusToFahrenheit(20));
        System.out.println(converterFahrenheitToCelsius(45));

    }

    public static double converterCelsiusToKelvin(double celsius){
        double kelvin = celsius + 273.15;
        return kelvin;
    }

    public static double converterKelvinToCelsius(double celsius){
        double kelvin = celsius - 273.15;
        return kelvin;
    }

    public static double converterCelsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double converterFahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }
}


