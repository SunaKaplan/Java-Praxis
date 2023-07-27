package day06;

import java.util.ArrayList;
import java.util.Arrays;

public class C01Arrays {

    // Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    //yeni bir Array olusturmadan var olan array in isaretleri degissin
    // input : 1,2,-3,4,-5,-6
    // output :-1,-2,3,-4,5,6

    public static void main(String[] args) {

       //1.yol array olusturma; int arr[]=new int[6]; burda elemanlari default degerlerden olusan bir array olusturmus oluruz

        // 2.yol array olusturma;

        int arr[]={1,2,-3,4,-5,-6}; //array imizi olusturduk
        System.out.println(Arrays.toString(arr)); //[1, 2, -3, 4, -5, -6]

        //tum elemanlari -1 ile carpacagiz bunun icin her lelemana ayni islemi uygulamak icin for loop kullaniyoruz

        for (int i = 0; i <arr.length ; i++) {

            arr[i]= arr[i]*-1;  //burda sag tarafta array in tum elemanlarini -1 ile carparim ve carpim sonucunu arr nin i. index ine koyarim

        }
        System.out.println(Arrays.toString(arr)); //[-1, -2, 3, -4, 5, 6]


    }
}
