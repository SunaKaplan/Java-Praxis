package day02;

public class C05_Concatenation {
    public static void main(String[] args) {

        // SELIM isminin icerisinde bulunan harfleri kullanmadan yazdırınız
    /* ASCİİ table kullanınız
               S = 83,
               E = 69,
               L = 76,
               I = 73,
               M = 77
    */
        char s=83;
        System.out.println(s);
        char e=69;
        System.out.println(e);
        char l=76;
        System.out.println(l);
        char i=73;
        System.out.println(i);
        char m=77;
        System.out.println(m);
        //SELIM
        System.out.println(s+e+l+i+m);//char verilerin arasinda toplama isareti varsa intellij bunlari matematiksel olarak toplar
        //yanyana yazdirmak icin(concatenation icin) basina "" koyarak bu ifadeyi stringe ceviririz
        //String bir ifade ile neyi oplarsak toplayalim sonuc string olur( yan yana yazilir)

        System.out.println(""+s+e+l+i+m);


    }

}
