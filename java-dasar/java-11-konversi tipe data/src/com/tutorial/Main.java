package com.tutorial;

public class Main {
    public static  void main(String[] args){
        // program untuk konversi data
        int nilaiInt = 450; // 32-bit
        System.out.println("nilai int = " + nilaiInt);

        // Memperluas rentang ke tipe data yang lebih luas
        long nilaiLong = nilaiInt; // 64-bit
        System.out.println("nilai long = " + nilaiLong);

        // Memperkecil rentang ke tipe data yang lebih kecil
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte = " + nilaiByte);

        // casting pembagian
        int a = 10;
        int b = 4;

        float c = (float) a / b;
        System.out.printf("%d / %d = %f", a, b, c);
    }
}
