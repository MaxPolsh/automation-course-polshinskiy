package org.example.lectures;

public class VolumeWater {
    public static void main(String[] args) {
        double v1 = 10;
        double v2 = 20;
        double t1 = 5;
        double t2 = 10;
        double volume = (v1 * t1 + v2 * t2) /(v1 + v2);
        System.out.println(volume);
        System.out.println(v1 + v2);
    }

}
