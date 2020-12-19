package org.example.homework.hw6;

public class Fraction {
    int x;

    int y;

    public Fraction(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public String toString() {
        return this.x + "/" + this.y;
    }

    public static Fraction sum(int x, int y, int num1, int num2) {
        Fraction sum = new Fraction(x, y);
        sum.x = (sum.x * num2) + (sum.y * num1);
        sum.y = sum.y * num2;
        return sum;
    }

    public static Fraction minus(int x, int y, int num1, int num2) {
        Fraction sum = new Fraction(x, y);
        sum.x = (sum.x * num2) - (sum.y * num1);
        sum.y = sum.y * num2;
        return sum;
    }

    public static Fraction mult(int x, int y, int num1, int num2) {
        Fraction mult = new Fraction(x,y);
        mult.x = mult.x * num1;
        mult.y = mult.y * num2;
        return mult;
    }

    public static Fraction div(int x, int y, int num1, int num2) {
        Fraction div = new Fraction(x,y);
        div.x = div.x * num2;
        div.y = div.y * num1;
        return div;
    }
}
