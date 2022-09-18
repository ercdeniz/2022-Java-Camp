package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 6;
        int total = 0;
        if (number < 0) {
            System.out.println("geçersiz sayı");
            return;
        }
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                total = i + total;
            }
        }
        if (number == total) {
            System.out.println("mükemmel sayıdır");
            return;
        } else {
            System.out.println("mükemmel sayı değildir");
        }
    }
}
