package day46_Maps;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {

        Map<Integer, String> sinifList = new HashMap<>();

        sinifList.put(101, "Ali, Can, JDev");
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");
        System.out.println(sinifList);
        //{101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet()); // [101, 102, 103, 104]
        System.out.println(sinifList.values()); // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size()); // 4

        /*
        Tum ogrencilerin isim ve soyisimlerini sira no ile alt alta yazdirin.
         */

        Collection<String> tumValueCollections = sinifList.values();

        String[] eachArr;
        int sira = 1;
        for (String each : tumValueCollections) {
            /*
             buradaki each bize her bir ogrenciye ait ayni yapidaki
             isim, soyisim, brans bilgilerini icren String'ler getiriyor.
             */
            eachArr = each.split(", ");
            System.out.println(sira + "- " + eachArr[0] + " " + eachArr[1]);
            sira++;

        }

        /*
        Map'de bulunnan ogrencilerin, isim ve soyisimlerin birlestirerek bir
        sinif listesi olusturun.
         */

        List<String> sinifİsimSoyisimListe = new ArrayList<String>();
        for (String each : tumValueCollections) {
            eachArr = each.split(", ");
            sinifİsimSoyisimListe.add(eachArr[0] + " " + eachArr[1]);
        }
        System.out.println(sinifİsimSoyisimListe);



    }
}
