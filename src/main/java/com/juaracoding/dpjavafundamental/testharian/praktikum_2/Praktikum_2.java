package com.juaracoding.dpjavafundamental.testharian.praktikum_2;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author ASUS a.k.a. Paul Christian
Java Developer
Created on 18/01/2023 9:22
@Last Modified 18/01/2023 9:22
Version 1.0
*/

import java.util.Scanner;

public class Praktikum_2 {
    /*
            Soal Nomor1 Praktikum 2 java fundamental
     */

    public static void main(String[] args) {
        //deklarasi dan inisialisasi
        Scanner sc = new Scanner(System.in);
        int intNumber = 0;
        double intTotal = 0;
        boolean isAgain = true;
        int intRata =0;

        try {
            System.out.println("Masukkan angka sepuasnya: ");
            do {
                intNumber = sc.nextInt();//input

                intTotal += intNumber;//proses penjumlahan input
            } while (isAgain);//perulangan utk input kembali
        } catch (Exception e) {//exception handling utk input karakter
            System.out.println("Jumlah: " + intRata);//output13
            System.exit(0);//keluar dari sistem
        }

    }
}

