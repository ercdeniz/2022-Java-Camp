package com.company;

public class Main {

    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Geçti! Not: A");
                break;
            case 'B':
                System.out.println("Geçti! Not: B");
                break;
            case 'C':
                System.out.println("Geçti! Not: C");
                break;
            case 'D':
                System.out.println("Geçti! Not: D");
                break;
            case 'F':
                System.out.println("Kaldı! Not: F");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz!");
        }
    }
}
