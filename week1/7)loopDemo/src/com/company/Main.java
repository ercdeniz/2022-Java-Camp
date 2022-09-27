package com.company;

public class Main {

    public static void main(String[] args) {
        //for
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");
        //while
        int i = 0;
        while (i <= 9) {
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
