package org.example.homework.hw2;

public class MagnitudeOfNumber {
    public static void main(String[] args) {
        int number1 = -9;
        int number2 = 3;
        if (Math.abs(number1) > Math.abs(number2)) {
            System.out.println(number1 + " больше чем " + number2);
        }
        else if (Math.abs(number1) < Math.abs(number2)){
            System.out.println(number2 + " больше чем " + number1);
        }
        else {
            System.out.println("Числа равны");
        }
    }
}
