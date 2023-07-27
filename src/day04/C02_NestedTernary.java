package day04;

import java.util.Scanner;

public class C02_NestedTernary {

    public static void main(String[] args) {

         /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir carakter giriniz");
        char ch= scan.next().charAt(0);

        // ASCII tablosunu kullanarak a-z arasini ve A-Z arasini alarak bir kontrol saglarim
        // ch nin a-z araliginda olmasi   ==>  ch>='a' && ch<= 'z'==> ile ifade edilir
        // ch nin A-Z araliginda olmasi  ==> ch>= 'A'&& ch<= 'Z' ==> ile ifade edilir


        System.out.println((ch>='a' && ch<= 'z')||(ch>= 'A'&& ch<= 'Z') ? (ch>='a' && ch<= 'z'? "kucuk harf":"kucuk harf degil") : ("Harf Degil"));// ir karakterin harf olma durumunu gosteren kod




    }



}
