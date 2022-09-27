package com.company;

public class Main {

    public static void main(String[] args) {
        int[] sayılar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int aranacak = 7;
        boolean varMı = false;
        int i;
        for (i = 0; i < 10; i++) {
            if (aranacak == sayılar[i]) {
                varMı = true;
                break;
            }
        }
        if (varMı) {
            System.out.println(aranacak + " sayısı var " + i + ". index.");
        } else {
            System.out.println("sayı yok!");
        }
    }
}
