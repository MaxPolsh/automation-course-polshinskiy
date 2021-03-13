package org.example.infrastructure.utils;

public class TimeUtils {
    public static void waitFor(int seconds){
        try {
            Thread.sleep(seconds * 1_000l);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
