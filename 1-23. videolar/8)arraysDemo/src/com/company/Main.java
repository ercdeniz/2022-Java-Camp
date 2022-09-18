package com.company;

public class Main {

    public static void main(String[] args) {
        String[] students = new String[4];
        students[0] = "Engin";
        students[1] = "Ercan";
        students[2] = "Ali";
        students[3] = "Ahmet";

        for (String student : students) {
            System.out.println(student);
        }
    }
}
