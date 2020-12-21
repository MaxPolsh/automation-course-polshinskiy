package org.example.homework.hw5;

import java.util.Arrays;

public class FirstToUpperCase {
    public static void main(String[] args) {
        String text = "gAME rUN hUMAN lINE";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase());
            System.out.print(" ");
        }
    }
}
