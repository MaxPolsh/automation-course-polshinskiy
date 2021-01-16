package org.example.infrastructure.utils;

import java.util.Random;

import static org.example.infrastructure.utils.StringUtils.Mode.*;

public class StringUtils {

    public static String randomString(Mode mode, int length){
        String symbols;
        switch (mode){
            case ALPHA:
                symbols = "abcdefghijklomnpqrstuvwxyz";
                break;
            case NUMERIC:
                symbols = "1234567890";
                break;
            case ALPHANUMERIC:
                symbols = "abcdefghijklomnpqrstuvwxyz1234567890";
                break;
            case HEX:
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

        public enum Mode {
        ALPHA, NUMERIC, ALPHANUMERIC, HEX
        }
    }

