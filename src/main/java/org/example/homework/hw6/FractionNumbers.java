package org.example.homework.hw6;


public class FractionNumbers {
    public static void main(String[] args) {

            Fraction fr1 = new Fraction(4,5);
            Fraction fr2 = new Fraction(3,4);

            Fraction fr3 = fr1.plus(fr2);
            System.out.println(fr3.toString());

            fr3 = fr1.minus(fr2);
            System.out.println(fr3.toString());

            fr3 = fr1.mult(fr2);
            System.out.println(fr3.toString());

            fr3 = fr1.div(fr2);
            System.out.println(fr3.toString());

    }
}


