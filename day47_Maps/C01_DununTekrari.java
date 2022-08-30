package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.Map;

public class C01_DununTekrari {

    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        /*
        ogreni listesini isim soyisim olarak yazdirin
         */

        ReusableMethods.tumValueSiraaliYazdir(sinifListMap);

        /*
        Kac farkli brans varsa bransIsmi = branstakiOgrencisoyisi seklinde yazdirin
         */
        ReusableMethods.bransOgrencisoyisiYazdir(sinifListMap);


    }
}
