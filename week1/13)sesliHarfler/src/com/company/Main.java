package com.company;

public class Main {

    public static void main(String[] args) {
        char harf = 'b';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli Harf");
                break;
            case 'E':
                System.out.println("İnce sesli Harf");
                break;
            default:
                System.out.println("Büyük, Sesli Harf Giriniz!");
        }
    }
}
