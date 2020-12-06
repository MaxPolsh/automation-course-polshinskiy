package org.example.homework.hw3;

import java.util.Scanner;

public class BinaryNumberToDecimal {
    public static void main(String[] args) {
        int binaryNumber;
        int decimal = 0;
        int p = 0;
        System.out.print("Enter binary number:");
        Scanner s = new Scanner(System.in);
        binaryNumber = s.nextInt();
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        }
        System.out.print("Decimal number:" + decimal);
    }
}
