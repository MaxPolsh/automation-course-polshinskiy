package org.example.lectures.branches;

import java.util.Random;

public class AgeParametr {
    public static void main(String[] args) {
        int age = new Random().nextInt(70 );
        System.out.println(age);
        System.out.println(
                age<= 12 ? "You're a(n) kid" :
                        age>=13 && age <= 17 ? "You're a(n) teenager" :
                                age >= 18 && age<=64 ? "You're a(n) adult" : "You're a(n) eldery");

        }
    }

