package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukkan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah: " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("tebakan anda: " + statusTebakan);

        // operasi aljabar boolean (and / or)

        System.out.print("masukan nilai diantara 4 dan 9: ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        System.out.println("tebakan anda: " + statusTebakan);
    }

}
