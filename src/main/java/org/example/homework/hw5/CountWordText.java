package org.example.homework.hw5;

public class CountWordText {
    public static void main(String[] args) {
        String text = "game run human line";

        String[] str = text.split(" ");

        System.out.println("Всего "+str.length+" слов");
    }
}

