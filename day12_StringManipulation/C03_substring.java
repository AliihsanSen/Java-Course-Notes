package day12_StringManipulation;

public class C03_substring {

    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyİsim = "Karanfil";
        String kartNo = "1234 6589 7458 9658";

        System.out.println(isim.substring(3)); // eyman
        System.out.println(soyİsim.substring(soyİsim.length() - 3)); // fil

        System.out.println(isim.substring(2, 4));
        // le (2. index dahil olacak ama 4. index dahil olmayacak)

        /*
        isim ve soyİsimin ilk harfi buyuk harf, geriye kalan *
        kredi karininin ilk 4rakami gorunsun geriye kalan gozukmesin
         */

        String isimİlkHarf = isim.substring(0, 1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1)
                .replaceAll("\\w", "*");

        String soyİsimİlkHarf = soyİsim.substring(0, 1).toUpperCase();
        String soyisimGeriyeKalanlar = soyİsim.substring(1)
                .replaceAll("\\w", "*");

        String kkIlk4   = kartNo.substring(0,4);
        String kkGeriyeKalanlar = " **** **** ****";

        System.out.println(isimİlkHarf + isimGeriyeKalanlar +" "+
                soyİsimİlkHarf + soyisimGeriyeKalanlar + " \n" +
                kkIlk4 + kkGeriyeKalanlar);


    }

}
