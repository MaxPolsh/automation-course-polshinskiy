package org.example.homework.hw5;

public class CountLetters {
    public static void main(String[] args) {
        String text = "Who is on duty today";
        String[] words = text.split(" ");
        int count = 0;


        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 1) {
                count++;

            }
        }
        System.out.println("Number of elements:" + words.length);
        System.out.println("Number of single elements:" + count);
    }
}
