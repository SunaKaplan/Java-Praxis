package day06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_List {
     /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));//List e eleman eklemenin kisa yolu
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {//listin elemanlarini index 0 dan baslayarak tek tek aldik
            if (list.get(i)>10){//listin i. indexteki elemanini alalim ve 10 dan buyuk mu diye bakalaim
                list.set(i,list.get(i)*2);//eger kosul saglaniyorsa listin gelen elemani 2 ile carpilarak guncellenecek


        }
            }

        System.out.println(list);
    }
}
