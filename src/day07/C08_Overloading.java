package day07;

public class C08_Overloading {
    //Method signature : isim, parametreler dir
    //Method signature ayni olan iki mehod olamaz
    // Overloading ayni isme sahip farkli methodlar olusturma islem,idir
    //Overloading icin method signature degismeli, yani isim ayni kalalacagi icin mecburen parametreler degisecek
    public static void main(String[] args) {
        // Aynı classta aynı isimde method olusturunuz
        //toplama methodu->int + int
        //toplama methodu->double + double
        //carpma methodu ->int*int*int
        //carpma methodu ->int*int*int*int
        //cikarma methodu->int-double
        //cikarma methodu->double-int

        toplama(3,5);
        toplama(3.2,5.1);

    }

    private static void toplama(int i,int i1) {
        System.out.println("Iki ineger deger toplami : " + i+i1);
    }

    private static void toplama(double v, double v2){
        System.out.println("Iki double degerin toplami");
    }
}
