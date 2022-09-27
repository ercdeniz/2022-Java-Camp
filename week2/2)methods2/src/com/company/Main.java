package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(topla(5, 7, 9, 41, 2));

        System.out.println("----------------");

        add();
        remove();
        update();

        System.out.println("----------------");

        String sehir = "Ankara";
        System.out.println(sehirVer(sehir));
    }

    public static void add() {
        System.out.println("eklendi");
    }

    public static void remove() {
        System.out.println("silindi");
    }

    public static void update() {
        System.out.println("güncellendi");
    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer(String sehir) {
        return sehir;
    }
}
