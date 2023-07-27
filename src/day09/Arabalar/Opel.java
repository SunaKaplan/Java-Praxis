package day09.Arabalar;

public class Opel extends Araba{
    String hiz="Opel arabalar max 220 km hiz yapar";

    String marka="Opel";

    String sirketMerkezi="Almanya";

    @Override
    protected void motor() {
       //parent class taki motor() methodunu override yaptik
        //yani opel class i icin motor() metodunu guncelledik
        System.out.println("Opel arabalar Opel marka motor kullanir");
    }
    protected  void garanti(){
        System.out.println("Opel arabalar 2 yil garantilidir");
    }
}
