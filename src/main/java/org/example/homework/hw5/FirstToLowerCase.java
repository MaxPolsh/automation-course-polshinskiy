package org.example.homework.hw5;

public class FirstToLowerCase {
    public static void main(String[] args) {
        String text = "Game Run Human Line";
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i].substring(0, 1).toLowerCase() + words[i].substring(1).toUpperCase());
            System.out.print(" ");
        }
    }
}
