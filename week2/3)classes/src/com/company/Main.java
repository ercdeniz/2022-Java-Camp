package com.company;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int num1=10;
        int num2=20;
        num2=num1;
        num1=30;
        System.out.println(num2);

        int[] numbers=new int[]{1,5,8};
        int[] numbers2=new int[]{7,5,6};
        numbers2=numbers;
        numbers[0]=10;
        System.out.println(numbers2[0]);
    }
}
