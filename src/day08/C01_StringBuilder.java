package day08;

import java.util.Scanner;

public class C01_StringBuilder {
    //kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
    //capasity lenght yazdırın
    //capasity i lenghte esıtleyın tekrar yazdırın
    //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
    //iki objeyi karsılastırın(== , equals , compareTo ile)

    public static void main(String[] args) {

    Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        // kullanıcının girdigi veriyi,ceren bir sb olustutralım
        //ilk olarak str,ng parametreli constr kullandım

        StringBuilder sb=new StringBuilder();
        System.out.println(sb);


}
}
