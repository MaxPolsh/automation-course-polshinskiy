package org.example.homework.hw1;
import static java.lang.Math.*;

public class GA2 {
    public static void main(String[] args) {
        double age = 30;
        double seconds = age * (3.154 * pow(10, 7));
        double minutes = age * 525600;
        double hours = age * 8760;
        double days = age * 365;
        double weeks = age * 52.1429;
        System.out.println("age" + age);
        System.out.println(seconds + "seconds");
        System.out.println(minutes + "minutes");
        System.out.println(hours + "hours");
        System.out.println(days + "days");
        System.out.println(weeks + "weeks");
    }
}
