package org.example.homework.hw5;

public class CountWordText {
    public static void main(String[] args) {
        int count = 0;
        String text = "game run human line";

        if(text.length() != 0){
            count++;
            for (int i = 0; i < text.length(); i++) {
                if(text.charAt(i) == ' '){
                    count++;
                }
            }
        }
        System.out.println("Всего "+count+" слов");
    }
}

