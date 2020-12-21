package org.example.homework.hw5;

public class CountLetters {
    public static void main(String[] args) {
        String text = "Who is on duty today";
        String[] words = text.split(" ");

        int longestLength = 1;
        for (String word : words) {

            if (longestLength < word.length())

                longestLength = word.length();
        }

        int[] counts = new int[longestLength + 1];
        for (String wordx : words) {

            counts[wordx.length()] += 1;
        }

        for (int i = 1; i < counts.length; i++) {
            System.out.println(i + " letter words: " + counts[i]);
        }
    }
}
