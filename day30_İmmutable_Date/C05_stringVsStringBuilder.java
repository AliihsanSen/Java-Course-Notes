package day30_İmmutable_Date;

import java.time.LocalTime;

public class C05_stringVsStringBuilder {

    public static void main(String[] args) {
        /*
        String mi yoksa StringBuilder mi daha hizlidir?
        bunun için bir String olusturup, 1000 kere sonuna (.) ekleyelim,
        oncesinde ve sonrasinda zamani alip aradaki farki bulalım.

        Ayni islemi StringBuilder icin de yapalim.
         */

        LocalTime baslangic =LocalTime.now();
        String str = "Ahhhh Java";
        for (int i = 0; i < 1000; i++) {
            str+=".";
        }

        LocalTime bitis =LocalTime.now();

        System.out.println("String baslangic = " + baslangic);
        System.out.println("String bitis = " + bitis);


        System.out.println("String zaman : "+(bitis.getNano() - baslangic.getNano()));



        baslangic =LocalTime.now();
        StringBuilder sb = new StringBuilder("Ahhhh Java");
        for (int i = 0; i < 1000; i++) {
            sb.append(".");
        }

        bitis =LocalTime.now();

        System.out.println("baslangic = " + baslangic);
        System.out.println("bitis = " + bitis);

        System.out.println("StringBuilder zaman : "+(bitis.getNano() - baslangic.getNano()));
    }
}
