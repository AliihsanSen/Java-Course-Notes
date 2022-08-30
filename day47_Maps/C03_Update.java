package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.*;

public class C03_Update {

    public static void main(String[] args) {

        /*
        map.contains(key); ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
        map.contains(value); ==> bir butun olarak value'nin map'de olup olmadigini doner

        ONEMLİ NOT  : map.contains(value); value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak map uzerinde
                      manipulation yapmamiz lazim.

        map.get(key); ==> verilen key'e ait degeri dondurur.
         */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);
                 /*
                 {101=Ali, Can, JDev,
                 102=Enes, Cem, Tester,
                 103=Taha, Emre, JDev,
                 104=Derya, Deniz, Tester,
                 105=Enes, Can, Tester,
                 106=Taha, Deniz, JDev,
                 107=Derya, Cem, Tester}
                  */
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false

        /*
         Verilen mapde JDev yerine JavaDeveloper olarak degistirelim.

         Map'lerde replace yok.

         Kismi degisikliklerde kullanamayiz.
         */

        ReusableMethods.tumValueSiraaliYazdir(sinifListMap);

        /*
        Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz.
        ornegin key 101 icin value Ali, Can, JDev
        guncelleme icin sinifListMap.put(101, Ali, Can, JDev)

        bunu yapabilmek icin her bir key'e ve ona ait value'ye ihtiyacim var
         */

        Set<Integer> keySeti = sinifListMap.keySet();

        String eachValue;
        for (Integer each : keySeti) {
            eachValue = sinifListMap.get(each);
            eachValue = eachValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each, eachValue);
            /*
            Biz key'lerin tamamini aldik her bir key'in value'sini getirdik.
            value uzerinden degiskligi yapip yeni halini put(key, yeniDeger) ile
            map'e koyduk.
             */
        }
        System.out.println(sinifListMap);

        /*
        {101=Ali, Can, JavaDeveloper,
        102=Enes, Cem, Tester,
        103=Taha, Emre, JavaDeveloper,
        104=Derya, Deniz, Tester,
        105=Enes, Can, Tester,
        106=Taha, Deniz, JavaDeveloper,
        107=Derya, Cem, Tester}
         */


    }
}
