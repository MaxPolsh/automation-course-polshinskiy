package org.example.lectures.branches;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight = 70;
        double height = 175;
        double bmi = weight/Math.pow(height,2);
        if (bmi <= 18.5){
            System.out.println("Underweight");
        }
        else if (bmi <= 25.0){
            System.out.println("Normal");
        }
        else if (bmi <= 30.0){
            System.out.println("Owerweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
