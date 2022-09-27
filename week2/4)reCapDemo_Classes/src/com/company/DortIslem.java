package com.company;

public class DortIslem {
    public int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public int cikar(int sayi1, int sayi2) {
        return sayi1 - sayi2;
    }

    public int carp(int sayi1, int sayi2) {
        return sayi1 * sayi2;
    }

    public  Double böl(double sayi1, double sayi2) {

        if (sayi2 <= 0) {
            System.out.println("Payda Sıfır'dan Küçük Olamaz");

        } else {
            double bölüm = sayi1 / sayi2;

            return sayi1 / sayi2;
        }
        return null;
    }
}
