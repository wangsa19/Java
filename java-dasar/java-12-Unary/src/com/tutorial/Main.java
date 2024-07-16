package com.tutorial;

public class Main {
    public static void main(String[] args){
        // unary = operasi yang dilakukan pada satu variable
        int angka = 1;
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);

        // unary decrement and increment
        int angka2 = 10;
        angka2++;
        System.out.printf("nilai dengan '++' menjadi %d\n",angka2);

        int angka3 = 10;
        angka3--;
        System.out.printf("nilai dengan '--' menjadi %d\n",angka3);

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi %d\n", ++a);

        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi %d\n", b++);

        // unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai boolean = " + ucup);
        System.out.println("nilai boolean = " + !ucup);


    }
}
