package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {
        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz için
        primitive data turlerinin her bir için actığı class'lardır

        İnt --> Integer
        char


         */

        String str = "Java ile hayat güzel";

        System.out.println(str.toUpperCase()); // JAVA İLE HAYAT GÜZEL

        boolean guzelMı = true;
        // guzelMı, boolean primitive oldugundan hazir method'u bulunmuyor.

        System.out.println(Short.MIN_VALUE); // -32768
        System.out.println(Short.MAX_VALUE); // 32767

        String ogrNo = "123456";

        //kullanicidan bir sifre isteyin.
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 5 basamaklı bir sifre giriniz");

        String sifre = scan.nextLine();

        Integer sifreSayi = Integer.parseInt(sifre);

        System.out.println("girilen sifre : " + sifre);
        System.out.println("Integer sifre : " + sifreSayi);

        /*
        Wrapper Class'lar ileride kullanabilecegiimiz pek çok faydali hazır method içerir.
         */

    }
}
