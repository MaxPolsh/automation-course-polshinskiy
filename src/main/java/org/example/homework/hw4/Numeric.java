package org.example.homework.hw4;


public class Numeric {
    public static void main(String[] args) {
        System.out.println(converterDecimalToBinary(13));
        System.out.println(converterBinaryIntoDecimal(1101));
        System.out.println(converterDecimalIntoHex(76));
        System.out.println(converterHexIntoDecimal("4C"));


    }

    public static String converterDecimalToBinary(int number) {
        int b;
        String x = "";

        while (number > 0) {
            b = number % 2;
            x = b + "" + x;
            number = number / 2;
        }
        return x;
    }

    public static int converterBinaryIntoDecimal(int number) {

        int decimal = 0;
        int p = 0;

        while (number != 0) {

                int temp = number % 10;
                decimal += temp * Math.pow(2, p);
                number = number/10;
                p++;
            }
        return decimal;
        }


    public static String converterDecimalIntoHex(int number) {

        int temp;
        String str = "";

        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        while (number > 0) {
            temp = number % 16;

            str = hex[temp] + str;

            number = number / 16;
        }
        return str;
    }

    public static int converterHexIntoDecimal(String number) {

        int len = number.length();
        int base = 1;
        int decVal = 0;

        for (int i = len - 1; i >= 0; i--) {
            if (number.charAt(i) >= '0' && number.charAt(i) <= '9') {

                decVal += (number.charAt(i) - 48) * base;

                base = base * 16;

            } else if (number.charAt(i) >= 'A' && number.charAt(i) <= 'F') {

                decVal += (number.charAt(i) - 55) * base;

                base = base * 16;
            }
        }
        return decVal;
    }
}
