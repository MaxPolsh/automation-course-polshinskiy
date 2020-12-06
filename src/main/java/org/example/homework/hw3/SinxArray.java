package org.example.homework.hw3;

public class SinxArray {
    public static void main(String[] args) {
        double sin;
        for (int i = 0; i <= 360 ; i+= 10) {
            sin = Math.sin(i);
            System.out.println(sin);
        }
    }
}
