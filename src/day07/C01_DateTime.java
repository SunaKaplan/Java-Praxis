package day07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01_DateTime {

    /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali'nin dogum tarihini 23/6/15 formatına benzer bir formatta yazdırın
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */
    public static void main(String[] args) {
        LocalDate dogumAli = LocalDate.of(1923, 10, 29).plusYears(45).plusMonths(8).plusDays(5);
        //Baslangic degerine of ve plus ile eklemeler yaptim

        LocalDate dogumVeli = LocalDate.of(1993, 9, 15).minusYears(24).minusMonths(2).minusDays(11);
        //Baslangic degerine of ve minus ile cikarmalar yaptim

        System.out.println(dogumAli);//1969-07-04
        System.out.println(dogumVeli);//1969-07-04

        // 23/6/15 bu formata cevirecegim.yani once iki haneli yil sonra tek haneli ay sonra iki haneli gun olarak
        // aralara slash koyarek yapacagim

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YY/M/dd");
        System.out.println(dtf.format(dogumAli)); //69/7/04

        //DateTimeFormatter variabele i kullanaral formatta ofPattern ile degisiklik yapacagim.
        // dtf nokta koyup format methodunu cagirip argiment olarak Ali nin dogum tarihini yazacagim

        if (dogumAli.equals(dogumVeli)) {
            System.out.println("Ali ve Veli nin dogum tarihi ayni");
        } else {
            System.out.println("Ali ve Veli nin dogum tarihi ayni degil");
        }

    }



    }



