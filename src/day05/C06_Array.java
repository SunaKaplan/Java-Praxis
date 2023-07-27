package day05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Array {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdırınız
        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan=new Scanner(System.in);
        int arr[]=new int[4];
        System.out.println(Arrays.toString(arr));//[0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scan.nextInt();
            arr[i] = sayi;

            //loopun bir dongusu bittigi anda array e assign ettigimiz variabelle sabit kalir,
            //ancak loop icinde olusturdugumuz variable ler yokolur look her calistiginda tekrar olusur

        }
        System.out.println(Arrays.toString(arr));


            //simdi ortalam bulacagiz
            //ilk once foreach ile array in elemanlarini toplayalim daha sonra eleman sayisina bolelim

            double toplam=0;

            for ( int w:arr) {
                toplam+=w;
                System.out.println(toplam);

            }
            System.out.println("toplam = " + toplam);

            System.out.println("ortalama = " + (toplam/4));


            //Ortalamadan daha buyuk olan array elemanlarini yazdiriniz

        for (int w: arr) {
            if (w>(toplam/4)){
                System.out.print(w+ " ");
            }

        }

        }

    }

