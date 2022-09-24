package com.program;
// Created by 21343017_Aldhy
import java.util.Scanner;

public class latihan01 {
    
    public static void main(String[] args) {
        double total_pembelian, diskon = 0;

        Scanner dataMasuk = new Scanner(System.in);
        System.out.println("Masukkan Total Pembelian: Rp ");
        total_pembelian = dataMasuk.nextDouble();

        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;

        System.out.println("Besarnya diskon : Rp "+diskon);

    }
}
