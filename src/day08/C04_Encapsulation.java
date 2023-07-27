package day08;

public class C04_Encapsulation {
    public static void main(String[] args) {
        //parametreli const kullanarak bir obje olusturalım

        C03_Encapsulatıon obj1 = new C03_Encapsulatıon("Ali", "Can", 25);
        // System.out.println(obj1.toString());
        System.out.println(obj1);//Intellij bunun obj1.toString oldugunu  anlıyor
        //objenın yasını 30 olarak guncellyin
        obj1.setYas(30);
        System.out.println(obj1);
        //parametresiz constroctur kullanarak 2. bir obje olusturun
        C03_Encapsulatıon obj2 = new C03_Encapsulatıon();
        System.out.println(obj2);
    }
}
