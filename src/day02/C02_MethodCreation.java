package day02;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
           /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        /*
        Amac:
        1 scanner kullanmak
        2 method olusturmak
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        System.out.println("swaptan onceki sayi1 : " + sayi1);
        System.out.println("swaptan onceki sayi2 : " + sayi2);

        //main method icinden method olustururken
        //1.methoda verecegin ismi yaz (herhangibir isim)
        //2.method parantezini koy
        //3.parantezin icine varsa argumentlerini yaz

       swaplaYazdir(sayi1,sayi2);

    }

   public static void swaplaYazdir(int sayi1, int sayi2) {

       int sayi3 ;//bos bir konteyner olusturduk
       sayi3=sayi1; // hem sayi2 hem de sayi3 te ayni deger var.burdan sonra sayi1 i bosaltabilirim deistirebilirim sayi3=10
       sayi1=sayi2; //simdi sayi1 de 20 var, sayi 2 yi degistirebilirim.cunku amacim sayi1 ve sayi2 nin yerini degistirmek
       sayi2=sayi3;//sayi3 teki 10 degerini sayi2 ye koyduk


       System.out.println("swaptan sonra sayi1 : " + sayi1);
       System.out.println("swaptan sonra sayi2 : " + sayi2);






    }

    }

