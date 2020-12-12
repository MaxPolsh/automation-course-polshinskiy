package org.example.infrastructure;

import java.util.Random;

public class StringUtils {

    public static String randomString(String mode, int length){
        String symbols;
        switch (mode){
            case "alpha":
                symbols = "abcdefghijklomnpqrstuvwxyz";
                break;
            case "numeric":
                symbols = "1234567890";
                break;
            case "alphanumeric":
                symbols = "abcdefghijklomnpqrstuvwxyz1234567890";
                break;
            case "hex":
                symbols = "1234567890ABCDEF";
            default:
                symbols = "";
        }
        String randomStr = " ";
        for (int i = 0; i < length; i++) {
            randomStr += symbols.charAt(new Random().nextInt(symbols.length()));

        }
        return randomStr;
        }
    }

