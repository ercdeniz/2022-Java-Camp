package com.company;

public class Main {

    public static void main(String[] args) {
        int sayı1 = 220;
        int sayı2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;

        if (sayı1 < 0 || sayı2 < 0) {
            System.out.println("pozitif sayı giriniz");
        }
        for (int i = 1; i < sayı1; i++) {
            if (sayı1 % i == 0) {
                toplam1 = i + toplam1;
            }
        }
        for (int j = 1; j < sayı2; j++) {
            if (sayı2 % j == 0) {
                toplam2 = j + toplam2;
            }
        }
        if (!(sayı1 < 0 || sayı2 < 0)) {
            if (toplam1 == sayı2 && sayı1 == toplam2) {
                System.out.println("arkadaş sayılar");
            } else {
                System.out.println("arkadaş sayı değiller");
            }
        }

    }
}
