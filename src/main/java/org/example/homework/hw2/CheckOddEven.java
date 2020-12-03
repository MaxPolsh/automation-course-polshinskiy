package org.example.homework.hw2;

import java.util.Random;

public class CheckOddEven {
    public static void main(String[] args) {
        int number = new Random().nextInt(50);
        System.out.println(number);

        if (number % 2 == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
        System.out.println("Bye!");
    }
}
