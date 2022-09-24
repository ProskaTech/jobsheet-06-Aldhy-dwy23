package com.program;
// Created by 21343017_Aldhy
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas2a {
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataMasuk = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("masukkan nilai pertama : ");
        String pertama = dataMasuk.readLine();

        int nilai = Integer.parseInt(pertama);
        System.out.println("");
        if (nilai>=1&&nilai<=10){
                System.out.println("Valid number");
            }

        else {
            System.out.println("Invalid number");
        }

    }
}
