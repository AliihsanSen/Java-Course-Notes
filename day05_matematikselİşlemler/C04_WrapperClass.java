package day05_matematikselİşlemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str = "Java Çok guzel";
        str.toUpperCase();

        int sayi = 10;
        /*
        primitive data türlerinin yaninda method'lar olmaz
        Java bazi method'lari kullanabilmemiz icin her bir primitive
        data turu icin bir wrapper class olusturmustur.
         */

        Integer sayi2 = 10;

        sayi2.byteValue();

    }
}
