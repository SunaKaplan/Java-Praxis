package day04;

import java.util.Scanner;

public class C03Switch {
    public static void main(String[] args) {
        // Kullanıcıdan uc basamaklı pozitif bir sayı sisteme girmesini isteyiniz
        // Bu sayıyı okunuşuna çeviren bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 asamakli bir sayi giriniz");
        int sayi = scan.nextInt();

        //125
        //yuz
        //yirmi
        //bes

        if (sayi < 100 || sayi > 999) {
            System.out.println("3 basamakli sayi girmelisiniz "); //sayinin 3 basamakli olmama durumu
        } else {//sayinin 3 basamakli olmasi durumunda yapilacak islemler

            //%-> a' ya bolumunden kalani verir
            int birler = sayi % 10; //birler basamagini verir
            int onlar = (sayi / 10) % 10; //onlar basamagini verir
            int yuzler = sayi / 100; //yuzler basamagini verir
            switch (yuzler) {
                case 1:
                    System.out.println("yuz");
                    break;
                case 2:
                    System.out.println("iki yuz");
                    break;
                case 3:
                    System.out.println("uc yuz");
                    break;
                case 4:
                    System.out.println("dort yuz");
                    break;
                case 5:
                    System.out.println("besyuz");
                    break;
                case 6:
                    System.out.println("alti yuz");
                    break;
                case 7:
                    System.out.println("yedi yuz");
                    break;
                case 8:
                    System.out.println("sekiz yuz");
                    break;
                case 9:
                    System.out.println("dokuz yuz");
                    break;
            }
            switch (onlar) {
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kirk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmis");
                    break;
                case 7:
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
            }
            switch (birler) {
                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("uc");
                    break;
                case 4:
                    System.out.println("dort");
                    break;
                case 5:
                    System.out.println("bes");
                    break;
                case 6:
                    System.out.println("alti");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;


            }
        }
    }
}
