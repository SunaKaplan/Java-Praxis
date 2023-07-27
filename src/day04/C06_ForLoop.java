package day04;

import java.util.Scanner;

public class C06_ForLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next().toLowerCase();//kullanicinin buyuk harfli kelime girme ihtimaline karsi
                                               // kullanicinin girdigi kelimeyi kucuk harfli yapip sonra aldim
        int sayac=0;//a harflerinin sayisini koyacagimiz konteynir, her a harfinde sayaci artiracagiz

        for (int i = 0; i <kelime.length() ; i++) {
            if (kelime.charAt(i)=='a'){
                sayac++;

            } else if (kelime.charAt(i)=='c') {
                break;//break keywordu loop u kirar. loop un disina cik demek isteriz

            }

        }
        System.out.println("Girdiginiz kelimedeki ilk c harfine kadar a harflerinin sayisi : "+sayac);
    }
}
