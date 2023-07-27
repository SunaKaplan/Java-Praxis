package day06;

import java.util.Arrays;

public class C02_Arrays {
    /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */

    public static void main(String[] args) {
        int[] arr={100, 10001, -90, 845, 8787, 898, 0, 1};

        System.out.println(Arrays.toString(arr));//[100, 10001, -90, 845, 8787, 898, 0, 1]

        Arrays.sort(arr);// aar array indeki elemanlari sort ile kucukten buyuge siralanmis oldu
        System.out.println(Arrays.toString(arr));//[-90, 0, 1, 100, 845, 898, 8787, 10001]

        System.out.println("minimum : " + arr[0]);//-90 burdaa arr yi  kucukten buyuge siraladiktan sonra ilk index i min deger olmusoluyor
        System.out.println("maximum : " + arr[arr.length-1]);//10001 arr deki son eleman yani max degere arr nin lengt -1 ile ulasmis oldum
        System.out.println("ikinci maximum " +arr[arr.length-2] );//8787 arr deki son elemandan birinci elemani yani max ikinci degere arr nin lengt -2 ile ulasmis oldum

        System.out.println(Arrays.toString(arr));


    }
}
