package org.example.lectures;

public class Converter {
    public static void main(String[] args) {
        double hrivna = 1000;
        double dollars = hrivna / 28.6;
        double pounds = hrivna / 38.02;
        double euro = hrivna / 31.6;
        double ruble = hrivna / 0.265;
        System.out.print(dollars);
        System.out.print(pounds);
        System.out.print(euro);
        System.out.print(ruble);
    }
}
