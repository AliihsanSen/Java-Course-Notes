package day48_Maps_TheEnd;

import day46_Maps.ReusableMethods;

import java.util.Map;

public class C02_MapMethodlari {
    public static void main(String[] args) {

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.clear();
        System.out.println("Cleardan sonra map : " + sinifListMap); // Cleardan sonra map : {}

        sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap.getOrDefault(104, "Aradiginiz key yok"));
        // Derya, Deniz, Tester

        System.out.println(sinifListMap.getOrDefault(110, "Aradiginiz key yok"));
        // Aradiginiz key yok

        System.out.println(sinifListMap.isEmpty()); // false

        sinifListMap.putIfAbsent(104, "Derya, Okyanus , Developer");
        sinifListMap.putIfAbsent(108, "Aysun, Can, Devops");
        ReusableMethods.entryYazdir(sinifListMap);

     /*
     SiniflistMap'e  key 106 yoksa value "Mevlut, Han, Tester" ekelyin
     106 daha onceden varsa, eski degeri degistirmek istediginizden emin misiniz? yazdirin

     106'nin oldugunu kontrol etmek icin containsKey daha mantikli ama biz
     yeni ogrendigimiz method ile yapalim

     map.putIfAbsent(key, value) ==> key varsa eklemek yapmaz, bıze o key ile kayitli olan
     value'yu getirir.
     ==> key daha onceden map'e eklenmemisse eklemeyi yapar ve bize null dondurur.
      */

        System.out.println(sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester"));
        //Taha, Deniz, JDev

        if (sinifListMap.putIfAbsent(106, "Mevlut, Han, Tester") == null) {
            System.out.println("Kayit Basarali");
        } else {
            System.out.println("eski degeri degistirmek istediginizden emin misiniz?");
        }
        System.out.println(sinifListMap.putIfAbsent(109, "Mevlut, Han, Tester"));
        // null ve listeye ekledi.
        ReusableMethods.entryYazdir(sinifListMap);

        sinifListMap.remove(106); // 106' yi silip bıze sildigini dondurur.
        sinifListMap.remove(107,"Derya, Cem, Tester"); // silerse true silmezse false dondurur.

        sinifListMap.replace(105,"Erdal, Cıftcı, Tester"); // 105=Erdal, Cıftcı, Tester
        sinifListMap.put(109,"Cavidan, Eken, JDev"); // 109=Cavidan, Eken, JDev
        ReusableMethods.entryYazdir(sinifListMap);

        System.out.println(sinifListMap.size()); // 7



    }
}
