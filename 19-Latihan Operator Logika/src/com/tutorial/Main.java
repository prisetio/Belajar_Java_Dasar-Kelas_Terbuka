package com.tutorial;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("test");

        // Menangkap sebuah objek untuk menangkap inputan dari user
        Scanner inputUser = new Scanner(System.in);

        // Sebuah program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.println("Masukan nilai tebakan anda: ");
        nilaiTebakan = inputUser.nextInt();
        System.out.println("Nilai tebakan anda adalah " + nilaiTebakan);

        //Operasi Logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Status tebakan anda adalah " + statusTebakan);

        // Operasi aljabar boolean (and / or)
        System.out.println("Masukan nilai diantara 3 dan 7: ");
        nilaiTebakan = inputUser.nextInt();
        statusTebakan = (nilaiTebakan > 3) && (nilaiTebakan < 7);

        System.out.println("Tebakan anda adalah: " + statusTebakan);
    }
}
