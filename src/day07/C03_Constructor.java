package day07;

public class C03_Constructor {
    public static void main(String[] args) {

    }
        //bu classta parametreli constructor olusturunuz
        //ve farklı bir classtan deger ataması yapınız

        String marka;

        String model;

        int yil;

        String yakit;


    public C03_Constructor(String marka, String model, int yil, String yakit){//sag tiklayip generate deyip constructor i sectim,
        // cons a hangi variaballeri parametre olarak koyacagimi ctrl ile sectim
            this.marka = marka;//burada yukardaki variabellara deger atamasi yapmamitik, this; bu classtaki marka ya  atama olarak
                        // costructer in icindeki parametre markayi atadi
            this.model = model;
            this.yil = yil;
            this.yakit = yakit;
        }
        //parametreli veya parametresiz herhangi bir cons olusturuldugunda
        //default cons ölür

    public C03_Constructor() {

    }


        //bir classaparametreli bir cons eklendiğinde mutlaka default cons benzer
        //parametresiz bir cons da eklenmeli
    }

