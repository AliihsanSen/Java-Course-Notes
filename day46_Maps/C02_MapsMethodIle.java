package day46_Maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);

        /*
        value'lari sira numarali olarak yazdirin
         */

        ReusableMethods.tumValueSiraaliYazdir(ogrenciMap);

        /*
        Isim ve soyisimlerin birlikte olacagi bir liste olusturun
         */

        List<String> sinifisimsoyisimlist = ReusableMethods.isimSoyisimListesiOlustu(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimlist);

    }
}
