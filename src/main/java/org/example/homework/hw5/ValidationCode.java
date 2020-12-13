package org.example.homework.hw5;

public class ValidationCode {
    public static void main(String[] args) {
        String code = "AX6BYU56UX6CV6BNT7NM 287430";
        System.out.println(code.replace("56", "").replace("6", "").replace("7N", "N"));
        System.out.println(code.substring(2, 3) + code.substring(6, 7) + "*" + code.substring(7, 8) + code.substring(10, 11) +
        "*" + code.substring(13, 14) + code.substring(17, 18) +" = "+ code.substring(21, 27));
    }
}
