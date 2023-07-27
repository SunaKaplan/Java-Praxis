package day_01;

public class C03_Ortalama {

    public static void main(String[] args) {
        /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.

     */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

         //double data turunde ismi toplam olamn bir variable olusturalim
        // ve bu variable a yazdigimiz 5 sayinin toplamini assign edelim(atayalim)

        double toplam= num1 + num2 + num3 + num4 + num5;
        //sayisal (numeric) datalarda + isreti matematiksel toplama islemi yapoar

        System.out.println("toplam = " + toplam);//609.7
        //ortalama =toplam/sayi adedi
        double ortalama=toplam/5;
        System.out.println("ortalama = " + ortalama);//121.94000000000001
    }


}





