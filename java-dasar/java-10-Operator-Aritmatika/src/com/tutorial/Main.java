package com.tutorial;

public class Main {

    public static void main(String[] args){
        // Operator Aritmatika
        int angka1 = 10;
        int angka2 = 5;

        int hasil;
        // 1. Penjumlahan
        hasil = angka1 + angka2;
        System.out.println(angka1 + " + " + angka2 + " = " + hasil);

        // 2. Pengurangan
        hasil = angka1 - angka2;
        System.out.printf("%d - %d = %d \n", angka1, angka2, hasil);

        // 3. Perkalian
        hasil = angka1 * angka2;
        System.out.printf("%d * %d = %d \n", angka1, angka2, hasil);

        // 4. Pembagian
        hasil = angka1 / angka2;
        System.out.printf("%d / %d = %d \n", angka1, angka2, hasil);

//        float a = 6;
//        float b = 5;
//        float hasilFloat = a / b;
//        System.out.println(a + " / " + b + " = " + hasilFloat);
//        System.out.printf("%f / %f = %f \n", a, b, hasilFloat);

        // 5. modulus
        hasil = angka1 & angka2;
        System.out.printf("%d & %d = %d \n", angka1, angka2, hasil);

    }

}
