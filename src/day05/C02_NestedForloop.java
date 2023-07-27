package day05;

import java.util.Scanner;

public class C02_NestedForloop {
    public static void main(String[] args) {
         /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

    örnegin: Satır Sayısı 5 icin;

     1
     2 3
     4 5 6
     7 8 9 10


     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir satir sayisi giriniz");
        int satirSayisi=scan.nextInt();

        int a=1;// bu variabeli kendim olusturdum

        for (int i = 0; i <satirSayisi ; i++) {//herbir satir icin calisacak

            for (int j = 0; j <i+1 ; j++) {//satirlara yazdigimiz herbir sayi icin calisacak
                System.out.print(a+ " ");
                a++;

            }
            System.out.println();

        }

    }
}
