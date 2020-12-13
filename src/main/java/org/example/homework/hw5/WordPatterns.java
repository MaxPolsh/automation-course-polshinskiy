package org.example.homework.hw5;

import java.util.Random;

public class WordPatterns {
    public static void main(String[] args) {
      String line = "help";
      int length = line.length();

        for (int i = 0; i < length; i++) {
            System.out.println(line.substring(i) + line.substring(0, i));
        }
    }
}
