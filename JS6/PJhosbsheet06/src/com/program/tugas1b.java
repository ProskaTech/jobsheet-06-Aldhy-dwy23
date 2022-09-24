package com.program;
// Created by 21343017_Aldhy
import javax.swing.JOptionPane;

public class tugas1b {
    public static void main(String[] args) {
        
        String pertama = JOptionPane.showInputDialog("masukkan nilai pertama : ");
        String kedua = JOptionPane.showInputDialog("masukkan nilai kedua : ");
        String ketiga = JOptionPane.showInputDialog("masukkan nilai ketiga : ");

        int num1 = Integer.parseInt(pertama);
        int num2 = Integer.parseInt(kedua);
        int num3 = Integer.parseInt(ketiga);

        int akhir = (num1+ num2+ num3) /3;


        if(akhir >= 60){
            JOptionPane.showMessageDialog(null,  "jadi nilai anda :"+akhir+" :-) ");
  
        }

        else {
            JOptionPane.showMessageDialog(null,  "jadi nilai anda :"+akhir+" :-) ");
        }

    }
}