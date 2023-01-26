package com.juaracoding.dpjavafundamental.testharian.praktikum_1;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author ASUS a.k.a. Daniel
Java Developer
Created on 15/01/2023 18:49
@Last Modified 15/01/2023 18:49
Version 1.0
*/

import java.util.Scanner;

public class Praktikum_1 {

    public static void main(String[] args) {
        //        char chASCII = 'r';
//        System.out.println(chASCII);
//        int intASCII = chASCII;
//        System.out.println(intASCII);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String strInput = sc.nextLine();
        System.out.println(strInput);

        System.out.println("Panjang Karakter Input adalah "+strInput.length());
//        System.out.println(strInput.charAt(11));
        char chInput = 'Y';
        int intInput = 0;
        int intTampung = 0;

        for (int i=0;i<strInput.length();i++)
        {
            chInput = strInput.charAt(i);
            intInput = chInput;
            if(intInput>=32 && intInput<=90)
            {
                intTampung = intTampung + intInput;
                System.out.println("Karakter ASCII index ke "+i+" ADALAH "+chInput+" Kode ASCII nya adalah "+intInput);
            }
        }

        System.out.println("Nilai INT TAMPUNG ADALAH "+intTampung);
    }
}
