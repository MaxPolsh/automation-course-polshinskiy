package org.example.homework.hw5;

public class CountLetters {
    public static void main(String[] args) {
        String[] text = {"six", "dog", "a", "fire", "b"};
        int count = 0;

        for (int i = 0; i < text.length; i++) {
            if (text[i].length() == 1) {
                count++;

            }
        }
        System.out.println("Number of single elements:" + count);
    }
}
