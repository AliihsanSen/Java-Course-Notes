package day23_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {

    public static void main(String[] args) {

        List<String> urunler = new ArrayList<String>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove method'u iki sekilde kullanilir
            1- Obje'yi yazip silmesini istersek bize boolean sonuc doner. true/false
            2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur.
         */

        System.out.println(urunler); // [Nutella, Ikram, Cekirdek, Cay]

        System.out.println(urunler.remove("Ikram")); // true
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby")); // false
        System.out.println(urunler); // [Nutella, Cekirdek, Cay]


        // Ikinci yontemi deneyelim yani index girelim.

        System.out.println(urunler.remove(1)); // Cekirdek
        System.out.println(urunler); // [Nutella, Cay]

        /*
         olmayan bir index'i silmeye calısırsak ?

         System.out.println(urunler.remove(3)); // IndexOutOfBoundsException

         */



    }
}
