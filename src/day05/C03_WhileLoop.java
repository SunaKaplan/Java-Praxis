package day05;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
        //or: 5!=1*2*3*4*5

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen faktoriyelini bulmak istediginiz sayiyi giriniz");
        int sayi=scan.nextInt();
        int carpim=1;//faktoriyel carpim sonucu icin yazdik

        int baslangic=1;//while loop ta baslangic degerini main metodun icinde loopun disinda yaziyoruz


        while (baslangic<=sayi){
            carpim=baslangic*carpim;


            baslangic++;

        }
        System.out.println(sayi + "!" + "=" + carpim);

    }
}
