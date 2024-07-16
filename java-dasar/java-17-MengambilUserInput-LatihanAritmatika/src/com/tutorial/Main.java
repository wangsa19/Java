package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        // Membuat perhitungan menghitung luas persegi panjang
        System.out.println("===== PERSEGI PANJANG");
        System.out.println("MENGHITUNG LUAS");
        System.out.print("Panjang = ");
        panjang = userInput.nextInt();
        System.out.print("Lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("===== BALOK PERSEGI PANJANG");
        System.out.println("MENGHITUNG VOLUME");
        System.out.print("Tinggi = ");
        tinggi = userInput.nextInt();
        volume = tinggi * luas;
        System.out.println("Volume = " + volume);
    }

}
