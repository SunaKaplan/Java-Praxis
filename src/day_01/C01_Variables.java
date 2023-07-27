package day_01;

public class C01_Variables {

    public static void main(String[] args) {

        //Bir variable olustur, yazdır
        int yas = 35;
        //variable syntax : veriable data turu + variable ismi + atama operatoru + variable degeri

        int sayi = 50;

        System.out.println(yas); //Not: Ctrl+D yapip satiri alt alta cogaltabilirim
        // yani Ctrl + D komutu imlecin solundadaki tüm kodlari bir alt satira Duplicate eder
        //Not: Variabels kodumuzu dinamik yapar
        //Ornek: sayi=50 seklinde konsola yazdir
        System.out.println("sayi = " + sayi);//sayi = 50 seklinde yazdirir.
        //yukaridaki yazdirma sekline variable i etiketi ile yazdirma denir
        //Kodlarimiz daginiksa bunu hizalamanin yolu Ctrl+alt+L-> dir
        // yazdirmanin kalvye ile yapilma sekli shift+f10 dur
        // bir variable i etiketi ile yazdirmanin kisa yolu = soutv
        //yani sayiyi etiketi ile yazdirmak istiyorsak
        //sayi deyip nokta koyarsak soutv cikiyor soutv secip enter dersek etiketi ile yazdirmis oluruz

        //string bir variable olusturalim -> non primitive bir data turu, "" icinde yazilir, buyuk harfle baslar

        String isim = "Ali";
        System.out.println("isim = " + isim);

        //Olusturdugun variable'ı farkli bir variable'a kopyala
        //yeni bir variable olusturacagim :benimYasim ve bu variable in degeri yas variablenin degerine esit olsun
        //mesela benimYasim variable nin degeri de yas variablenin degeri gibi 36 olsun

        int benimYasim = yas;
        String onunIsmi = isim;

        //camelCase
        //PascalCase
        //snake_case
        //kebab-case

        //Aynı satırda coklu variable deklare et
        int yil = 2023, ay = 5, gun = 15; // ayni satirda tek bir data tipi ile 3 variable deklare ettik.

        //Bir variable degerini guncelle
        //az one olusturdugumuz isim variablenin degerrini Veli olarak guncelle
        isim = "Veli"; //guncellemek icin tekrardan String ifadesini yazarsak hata aliriz.
        System.out.println("isim = " + isim); // yukaridaki Ali ismi Veli olarak guncellendi

        //!!!!!JAVA YUKARIDAN ASAGI VE SOLDAN SAGA CALISISIR!!!!!

        //Degişkenleri(variable) yazdır

        //Bir variable deklere et : x //deklerasyon islemi icin deger atamasi yapmak zorunda degiliz
        double x;



        //Bir variable baslat : y //bir variable in baslamasi demek deger atamasi yapilmasi demek

        double y= 12.5;


        //Başka bir variable başlat : z
        double z= 33;// java buraya yazdigimiz 33 degerini 33.0 olarak algiladi ve hata vermedi

        //x degişkenini y degişkeni ile başlat
         x = y; // bir variable bir scope(main method) da sadece bir kez deklare edilebilir

        //Variable y'i guncelle
        y= 13.9;



        //Degişkenleri yazdir
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }


}
