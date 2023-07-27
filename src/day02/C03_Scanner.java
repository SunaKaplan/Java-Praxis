package day02;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
        //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int x=input.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int y=input.nextInt();

        boolean sonuc=karelerEsitMi(x,y);//sonuc boolean olacagindan boolean dedim
        System.out.println("sonuc = " + sonuc);


    }

    public static boolean karelerEsitMi(int x, int y) {

        //javada = isareti Assignment (atama) isaretidir
        //matematiksel anlkamdaki esit icin bunu kullaniriz

        boolean sonuc= x*x==y*y;
        return sonuc;
    }


}
