package com.company;

public class Main {

    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 3;
        int enBbüyük = sayi1;

        if (enBbüyük < sayi2) {
            enBbüyük = sayi2;
        }
        if (enBbüyük < sayi3) {
            enBbüyük = sayi3;
        }
        System.out.println("En Büyük Sayı: " + enBbüyük);
    }
}
