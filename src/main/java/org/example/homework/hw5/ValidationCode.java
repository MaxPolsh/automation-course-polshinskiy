package org.example.homework.hw5;

public class ValidationCode {
    public static void main(String[] args) {
        String code = "AX6BYU56UX6CV6BNT7NM 287430";
        int str = 1;

        String[] strings = code.split(" ");

        String str1 = strings[0].replaceAll("\\D","");

        int str2 = Integer.parseInt(strings[1]);

        char[] chars = str1.toCharArray();

        for (int i = 0; i < chars.length; i++) {

            str = Integer.parseInt(chars[i] + "" + chars[i+1]) * str;

            i = i + 1;

        }
       // boolean res =
        System.out.println(str + "=" + str2);
    }
}
