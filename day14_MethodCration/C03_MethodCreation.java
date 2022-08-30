package day14_MethodCration;

public class C03_MethodCreation {

    public static void main(String[] args) {

        /*
       input olarak verilen isim ve soyismi
       ilk harfi buyuk geriye kalan harfler * olacak sekilde
       I***** K**** seklinde yazdiran bir method olusturun.
         */

        String isim = "Enes";
        String soyİsim = "Bozkurt";

        ismiGizle(isim, soyİsim);
        C02_MethodCreation.rakamlariTopla(654);
        

    }

    public static void ismiGizle(String isim, String soyİsim) {

        isim = isim.substring(0, 1).toUpperCase()
                + isim.substring(1).replaceAll("\\w", "*");

        soyİsim = soyİsim.substring(0, 1).toUpperCase()
                + soyİsim.substring(1).replaceAll("\\w", "*");

        System.out.println("isim :" + isim + "\n" + "soyİsim :" + soyİsim);

    }


}
