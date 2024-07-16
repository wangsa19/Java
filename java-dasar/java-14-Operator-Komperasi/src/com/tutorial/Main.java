package com.tutorial;

public class Main {
    public static void main(String[] args){
        // operator komperasi = ini akan menghasilkan nilai dalam bentuk boolean

        int a, b;
        boolean hasilKomparasi;

        // operator equal atau persamaan
        System.out.println("------- PERSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n", a, b, hasilKomparasi);

        // operator not equal atau pertidaksamaan
        System.out.println("------- PERTIDAKSAMAAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n", a, b, hasilKomparasi);

        // operator less than atau kurang dari
        System.out.println("------- KURANG dari");
        a = 10;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n", a, b, hasilKomparasi);

        // operator greather than atau lebih dari
        System.out.println("------- LEBIH dari");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n", a, b, hasilKomparasi);

        // operator less than equal atau kurang dari sama dengan
        System.out.println("------- KURANG DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n", a, b, hasilKomparasi);

        // operator greather than equal atau lebih dari sama dengan
        System.out.println("------- LEBIH DARI SAMA DENGAN");
        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);
        a = 12;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n", a, b, hasilKomparasi);



    }
}
