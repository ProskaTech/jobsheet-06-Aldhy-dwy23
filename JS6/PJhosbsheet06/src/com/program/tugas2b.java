package com.program;
// Created by 21343017_Aldhy
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas2b {
    public static void main(String[] args) throws IOException {
        
        BufferedReader dataMasuk = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("masukkan nilai pertama : ");
        String pertama = dataMasuk.readLine();

        int nilai = Integer.parseInt(pertama);
        System.out.println("");

    switch(nilai){
        case 1: System.out.println("Valid Number"); break;
        case 2: System.out.println("Valid Number"); break;            
        case 3: System.out.println("Valid Number"); break;
        case 4: System.out.println("Valid Number"); break;
        case 5: System.out.println("Valid Number"); break;
        case 6: System.out.println("Valid Number"); break;
        case 7: System.out.println("Valid Number"); break;            
        case 8: System.out.println("Valid Number"); break;
        case 9: System.out.println("Valid Number"); break;
        case 10: System.out.println("Valid Number"); break;
   
    default:
            System.out.println("Invalid Number");
        }
    }
}