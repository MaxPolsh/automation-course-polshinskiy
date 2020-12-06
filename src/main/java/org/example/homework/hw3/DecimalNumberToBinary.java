package org.example.homework.hw3;

import java.util.Scanner;

public class DecimalNumberToBinary {
    public static void main(String[] args)
    {
        int n;
        int a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while(n > 0)
        {
            a = n % 2;
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
    }
}

