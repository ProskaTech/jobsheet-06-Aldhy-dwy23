package com.program;
// Created by 21343017_Aldhy
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Created by 21343017_Aldhy
public class tugas1a {
    public static void main(String[] args) throws IOException {
        BufferedReader dataMasuk = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("masukkan nilai pertama : ");
        String pertama = dataMasuk.readLine();
        System.out.println("masukkan nilai kedua : ");
        String kedua = dataMasuk.readLine();
        System.out.println("masukkan nilai ketiga : ");
        String ketiga = dataMasuk.readLine();

        //konfersi data
        int nilai1 = Integer.parseInt(pertama);
        int nilai2 = Integer.parseInt(kedua)   ;   
        int nilai3 = Integer.parseInt(ketiga);
        
        int akhir = (nilai1+ nilai2+ nilai3) /3;

        if(akhir >= 60){
            System.out.println("jadi nilai anda :"+akhir+" :-) ");
        }

        else {
            System.out.println("jadi nilai anda :"+akhir+" :-( ");
        }


    }
}
