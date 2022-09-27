package com.company;

public class Main {

    public static void main(String[] args) {
        int[] sayılar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        sayiBulmaca(7, sayılar);
    }

    public static void sayiBulmaca(int aranacak, int[] sayilar) {

        boolean varMi = false;
        int i;
        for (i = 0; i < 10; i++) {
            if (aranacak == sayilar[i]) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            mesajVer(aranacak + " sayısı var " + i + ". index.");
        } else {
            mesajVer("sayı yok");
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}
