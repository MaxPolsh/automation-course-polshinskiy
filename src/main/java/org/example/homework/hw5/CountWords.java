package org.example.homework.hw5;

public class CountWords {
    public static void main(String[] args) {
        String[] text = {"six", "vector", "a", "fire", "xerox", "five"};
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int text1;

        for (int i = 0; i < text.length; i++) {
            text1 = text[i].length() == 1 ? count1++ :  text[i].length() == 2 ?
                    count2++ : text[i].length() == 3 ?
                    count3++ : text[i].length() == 4 ?
                    count4++ : count5++;
        }
        System.out.printf("One:" + count1 +"%n" + "Two:" + count2 +"%n"+"Three:" + count3 +"%n" +"Four:" + count4 +"%n"+"Five:" + count5);
    }
}
