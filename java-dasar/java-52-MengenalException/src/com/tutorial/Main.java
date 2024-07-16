package com.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = {0, 1, 2, 3};
        Scanner userInput = new Scanner(System.in);
        System.out.print("nilai array ke: ");
        int index = userInput.nextInt();
        System.out.printf("Index ke-%d, adalah %d", index, array[index]);

    }
}