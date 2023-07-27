package day09.Arabalar;

public class Corsa extends Opel{
    //Corsa modeline ait spesifik ozellikler bu classta tanimlayalim
    //daha sonra bu classta main method icinde objeler olusturalim

    String hiz="Corsa max 200km hiz yapar";

    String yakit="Corsa benzinli veya elektriklidir";

    String model="Corsa";

    @Override
    protected void yakitTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tukeir");
    }


    @Override
    protected void motor() {
        System.out.println("Corsa arabalar cevreci motor kullanir");

    }

    //corsa classinda obje olusturalim

    public static void main(String[] args) {
        //bir tane corsa objesi olusturalim
        //satic metodtan instance datalara ulasabilmek icin obje olustururum

        Corsa arb1=new Corsa();
        System.out.println("arb1.hareket = " + arb1.hareket);//Araba class indan
        System.out.println("arb1.hiz = " + arb1.hiz);//Corsa class indan
        System.out.println("arb1.yakit = " + arb1.yakit);//Corsa dan
        System.out.println("arb1.marka = " + arb1.marka);//Opel class indan
        System.out.println("arb1.sirketMerkezi = " + arb1.sirketMerkezi);//Opel den
        System.out.println("arb1.model = " + arb1.model);//Corsa
        arb1.motor();//Corsa dan

        //bir tane Opel araba olusturalim
        //yani bir opel objesi olusturalim

        Opel arb2=new  Corsa();//data turu parent, const child olacak sekilde de obje olusturulabilir
        System.out.println("arb2.hareket = " + arb2.hareket);//Araba class indan
        System.out.println("arb2.hiz = " + arb2.hiz);//Opel
        System.out.println("arb2.yakit = " + arb2.yakit);//Araba
        System.out.println("arb2.marka = " + arb2.marka);//opel
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);//opel den
        //arb2.model==> burada CTE verir
        arb2.motor();//Corsa dan geldi.Neden?
        /*
       ==> inheritance da variable lar;
        aramaya data turu neyse oradan baslar
        yoksa parente bakar, ilk buldugu yerden alir

      ==> inheritance da methodlar;
        aramaya data turunden baslar
        yoksa parente bakar, bu sefer ilk buldugu yerden almaz
        constroctur in oldugu classa kadar override edilmis mi diye bakar

         */

        //arama islemi her zaman asagidan yukari dogru olur
        //override edilmismi diye yukaridan asagi dogru bakilir

        arb2.garanti();//Opel
        arb2.yakitTuketimi();//corsa
        //arb2.vitesSayisi==>CTE verir

        Araba arb3=new Corsa();
        System.out.println("arb3.hareket = " + arb3.hareket);//Arabadan
        System.out.println("arb3.hiz = " + arb3.hiz);
        System.out.println("arb3.yakit = " + arb3.yakit);
        //arb3.sirketMerkezi==> CTE
        arb3.yakitTuketimi();//bu bir variable degil metod, bu nedenle Araba classina bakar ve oradan
        //cunstructer ismine(arb3 icin==>Corsa) kadar  override edilmis  mi diye bakar
        //arb3.garanti==> Araba classina bakar burada bulamadiysa diger classlara hic bakmaz,
        //Ovrride edilmismi diye bakmasi icin once kendi class inda bulmasi gerekir

        Araba arb4=new Opel();
        arb4.motor();//Opel
        //Ovvrriding kontrol edilirken
        //constroctur in oldugu classa kadar bakilir
        //arb4.garanti ==> CTE

    }

    // KONU OZETI :
    Araba obj1=new Araba();//method icin override edilmis mi diye kontrol etmeme gerek yok
    Araba obj2=new Opel();//methodu once Araba da bulmaliyiz sonra Opel de override edilmismi diye bakmaliyiz
    Araba obj3=new Corsa();//Methodu once arabada bulmaliyiz sonra Corsa child class ina kadar Override edilmismi diye bakmaliyiz

    Opel obj4=new Opel();
    Opel obj5=new Corsa();

    Corsa obj6=new Corsa();
}
