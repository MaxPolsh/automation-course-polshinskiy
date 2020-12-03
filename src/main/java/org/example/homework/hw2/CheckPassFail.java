package org.example.homework.hw2;

import java.util.Random;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark = new Random().nextInt(50);
        System.out.println(mark);

        if (mark >= 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
        System.out.println("Done");
    }
}
