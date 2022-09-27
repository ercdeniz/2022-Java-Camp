package com.company;

public class Main {

    public static void main(String[] args) {
        double[] mylist = {3.4, 2, 3.4, 5.6, 9.1, 7};
        double total = 0;
        double max = mylist[0];
        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam: " + total);
        System.out.println("En Büyük: " + max);
    }
}
