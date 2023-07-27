package day05;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız

        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi=scan.nextInt();


        if(sayi%10==0){
            System.out.println("Hatali giris");// 10 a bolunen sayi girildiginde loopa hic girmedi ve hata verdi
        }

        while (sayi%10!=0){ //10 a bolunememe durumuna bakiyoruz.cunku soruda dongum 10 bkati bir sayi gelene kadar calis diyor.
            System.out.print(sayi+ " ");
            sayi++;

        }
    }
}
