package org.example.homework.hw3;

public class SumOfColums {
    public static void main(String[] args) {

        int[] a = {2, 6, 8, 19, 56, 12};
        int[] b = {5, 9, 6, 45, 1, 2};


        for (int i = 0; i < a.length; i++){
            int sumRow = a[i] + b[i];

                if (a.length!=b.length) {
                    System.out.println("Массивы не совпадают");
                }
                else
                    System.out.println(a[i] + "|" + b[i] + "|" + sumRow);
            }
        }
    }


