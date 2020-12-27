package org.example.homework.hw6;

import java.util.Objects;

public class Fraction {
    int numer;
    int denom;

    public Fraction(int num, int den){
        numer = num;
        denom = den;
    }

    public int getNumer(){

        return numer;
    }

    public int getDenom(){

        return denom;
    }

    Fraction plus(Fraction x){

        Fraction answer;
        int num = (numer * x.getDenom()) + (denom * x.getNumer());
        int den = denom * x.getDenom();
        answer = new Fraction(num, den);

        return answer;
    }

    Fraction minus(Fraction x){

        Fraction answer;
        int num = (numer * x.getDenom()) - (denom * x.getNumer());
        int den = denom * x.getDenom();
        answer = new Fraction(num, den);

        return answer;
    }

    Fraction mult(Fraction x){

        Fraction answer;
        int den = denom * x.getDenom();
        int num = numer * x.getNumer();
        answer = new Fraction(num, den);

        return answer;
    }

    Fraction div(Fraction x){

        Fraction answer;
        int num = numer * x.getDenom();
        int den = denom * x.getNumer();
        answer = new Fraction(num, den);

        return answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numer == fraction.numer && denom == fraction.denom;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numer, denom);
    }

    public String toString(){

        return this.numer + "/" + this.denom;
    }
}


