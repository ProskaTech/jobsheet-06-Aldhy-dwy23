package com.program;

import java.util.Scanner;

// Created by 21343017_Aldhy
public class latihan2 {
    public static void main(String[] args) {
        double total_pembelian,diskon =0;

        Scanner dataMasuk = new Scanner(System.in);
        System.out.println("Masukan Total Pembelian: Rp ");
        total_pembelian = dataMasuk.nextDouble();

        if (total_pembelian >= 50000)
            diskon = 0.1*total_pembelian;

        else 
            diskon=0.02 *total_pembelian;

        System.out.println("Besarnya diskon : Rp "+diskon);


    }
}
