package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 2;
        boolean asal = true;

        if (number == 1 || number == 0) { // sayı 1 girilirse diye önlem aldım
            System.out.println("En Küçük Asal Sayı 2'dir");
            return; // bu fonksiyon çalışırsa programı bitir dedim
        }
        if (number < 0) { //sıfır veya eksili bir sayı girilirse diye önlem aldım
            System.out.println("Pozitif Sayı Giriniz");
            return; // bu fonksiyon çalışırsa programı bitir dedim
        }
        for (int i = 2; i < number; i++) { //girilen sayıyı, girilen sayıya kadar bütün sayılara böldüm
            if (number % i == 0) { //eğer birine bölünürse yani asal değilse bu blok çalışacak
                asal = false;
                System.out.println("Şu Sayıya Bölünüyor" + "\n" + "=> " + i); // asal olmadığında o sayının bölündüğü sayıları yazdırdım
            }
        }
        if (asal == true) {
            System.out.println("Sayı Asaldır");
        } else {
            System.out.println("Sayı Asal Değildir");
        }

    }
}

