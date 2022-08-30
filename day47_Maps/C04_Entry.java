package day47_Maps;

import day46_Maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {

    public static void main(String[] args) {

        /*
        Java Entry <K, V> map'in icerisinde bulunan her bir koydi
        K=V seklinde tutar.
        dolayisiyla herhangi bir Entry'e ulastigimizda hem key'e hem de
        value'ya ulasabilir ve istedigimiz islemleri yapabiliriz

        entry.getKey() bize key'i getirir
        entry.getValue() bize value'yu getirir
        entry.setValue() value'yu istedigimiz deger olarak update eder
         */

        Map<Integer, String> sinifListMap = ReusableMethods.mapOlustur();

        System.out.println(sinifListMap);

        /*
        Map'in Her bir elemani alt alta yazdirin.
         */
        Set<Map.Entry<Integer, String>> sinifEntrySet = sinifListMap.entrySet();

        for (Map.Entry<Integer, String> each : sinifEntrySet) {
            System.out.println(each);
        }
        /*
        Map içerisindeki Tester kurs ismini QA olarak degistirelim
         */

        String eachValue;

        for (Map.Entry<Integer, String> each : sinifEntrySet) {
            eachValue = each.getValue();
            eachValue = eachValue.replace("Tester", "QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMap);


        /*
        {101=Ali, Can, JDev,
        102=Enes, Cem, QA,
        103=Taha, Emre, JDev,
        104=Derya, Deniz, QA,
        105=Enes, Can, QA,
        106=Taha, Deniz, JDev,
        107=Derya, Cem, QA}
         */


    }
}
