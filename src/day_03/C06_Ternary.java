package day_03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {

        //kullanıcıdan pozitif bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 veya daha cok basamakli birsayi giriniz");
        int sayi=scan.nextInt();

        kacBasamakli(sayi); //metod olusturduk bmiHesapla(kilo,boy);

    }

    public static void kacBasamakli(int sayi) {
        //birsayi 99 dan buyukse 3 veya daha cok basamaklidir

        System.out.println(sayi>99 ? "Sayi 3 veya daha cok basamakli" : "Sayi 3ten az basamakli");

    }
}
