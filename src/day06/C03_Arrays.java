package day06;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {

     /*
        arr[3][2] luk bir multidimensionalarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int arr[][]={{3,4}{1,2}{8,7}}-----> {7,3,15}

      */
     public static void main(String[] args) {

         int arr[][]=new int[3][2];//ilk yazdigimiz 3 distaki array in uzunlugu, ikinci yazdigimiz 2 icteki array in uzunlugunu ifade eder
                                   //burada bos bir array olusturmus oluyoruz.Yani yazdirirsak {{0,0},{0,0},{0,0}}

         Scanner scan=new Scanner(System.in);

         for (int i = 0; i <arr.length ; i++) { //arr.lengt= burada 3 tur.Yani distaki arryin uzunlugu.burda distaki array in herbir elemanini ele alirim

             for (int j = 0; j <arr[i].length; j++) {
                 //arr[i][j]-->arr[0][0]===> bu arr nin sifirinci index inin sifirinci index i demek oluyor
                 System.out.println("lutfen eklemek istediginiz elemani giriniz");
                 arr[i][j]=scan.nextInt();
             }
         }
         System.out.println(Arrays.deepToString(arr));
         int brr[]=new int[arr.length];

         for (int i = 0; i <arr.length ; i++) {
             int toplam=0;
             for (int j = 0; j <arr[i].length ; j++) {
                 toplam+=arr[i][j];
             }
             brr[i]=toplam;
         }
         System.out.println(Arrays.toString(brr));

     }
}
