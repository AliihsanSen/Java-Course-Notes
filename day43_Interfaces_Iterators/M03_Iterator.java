package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println("liste = " + liste); // liste = [10, 20, 30]

        // liste'deki tum elementleri INDEX KULLANMADAN 3 artirin.

        for (Integer each : liste) {
            System.out.println(each + 3 + " ");
        }

        /*
        Java Index yapısı olmayan collection'lardaki elementlere ulasmak veya degistirmek
        icin Iterator ınterface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir.
        bunun yerine bize iterator döndüren liste.iterator(); method'unu kullaniyoruz.

         */
        System.out.println("liste = " + liste); // liste = [10, 20, 30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next()); // 10
        System.out.println(it1.next()); // 20
        System.out.println(it1.next()); // 30
        // System.out.println(it1.next()); // 30'dan sonra element kalmadigindan nect() RTE verir.
        /*
        iterator'da geri donus yok.
        Adim adim sona ulastiktan sonra basa gelen isterseniz yeninde bir iterator
        olusturmaniz gerekir.
         */

        Iterator it2 = liste.iterator();
        // yeni it2'yi kullanarak listenin tum elementlerini silelim.
        it2.next();
        it2.remove(); // [20, 30]
        it2.next();
        it2.remove(); // [30]
        it2.next();
        it2.remove(); // []
        System.out.println(liste);
        /*
        iterator ile elementleri gezip, remove yapinca liste kalici olarak degisti.
         */

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste); // [10, 20, 30]

        Iterator it3 = liste.iterator();
        while (it3.hasNext()) {
            it3.next();
            it3.remove();
        }
        System.out.println("Loop'dan sonra liste : "+ liste); // Loop'dan sonra liste : []

        /*
        Goruldugu gibi Iterator kullanarak yapabildigim
            1- tum collection elementlerini yazdirmak
            2- tum collection elementlerini silmek
        Bu da bize yetmez.
         */

    }
}
