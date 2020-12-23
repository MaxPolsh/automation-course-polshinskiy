package org.example.lectures.FirstLecture;

public class ChengeNumber {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
