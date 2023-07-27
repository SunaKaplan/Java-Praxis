package day02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */

        Scanner girdi=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        //char data turunde bir veri almak istiyorum
        //Ancak scanner objesinin(girdi) methodlarina bakinca nextChar diye bir methodun olmaigini gorduk
        //scanner ile char almak istiyorsak once String olarak aliriz-> ( next() methodu ile )
        //daha sonra bu stringin charAt(0) methodu ile 0. indexindeki karakterini aliyoruz

        char ch=girdi.next().charAt(0);// 0 burada 0. index demek, stringlerde index yapisi vardir ve sifirdan baslar
        System.out.println("ch = " + ch);

        System.out.println("================================");

        /*
          A     -> 2 bosluk+ ch + 2 bosluk
         A A    -> 1 bosluk +ch +1 bosluk + ch + 1 bosluk
        A A A   -> ch + 1bosluk + ch + 1bosluk +ch
        */

        //konsolda bosluk(space) gormek icin mutlaka spacelerin bi "" icinde olmasi gerekir

        System.out.println("  "+ ch + "  ");
        System.out.println(" "+ ch + " " + ch + " ");
        System.out.println(ch+ " " + ch + " " + ch);

        System.out.println("=============================");

        // bu islemi tek sout ile yapmak istesem -> \n ile yapariz -> imleci bir alt satira gecirir
        System.out.println("  " + ch + "\n " + ch + " "+ ch + "\n"+ch+" "+ch+ " "+ch);
    }
}
