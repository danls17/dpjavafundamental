package com.juaracoding.dpjavafundamental.testharian.praktikum_1;
/*
Created By IntelliJ IDEA 2022.2.3 (Community Edition)
Build #IU-222.4345.14, built on October 5, 2022
@Author ASUS a.k.a. Paul Christian
Java Developer
Created on 15/01/2023 18:49
@Last Modified 15/01/2023 18:49
Version 1.0
*/

import java.util.Scanner;

public class Praktikum_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Kata:");
        String txtInput = input.nextLine();

        int total = 0;
          char[] karakter = txtInput.toCharArray();
          for (char e : karakter) {
              if (!Character.isLowerCase(e)) {
                  System.out.println(e + " = " + (int) e);
                  total += (int) e;
              }
          }
        System.out.println("Hasil = "+total);
        }
}
