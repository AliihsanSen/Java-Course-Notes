package day29_PassByeValue_Immutable;

import java.util.ArrayList;
import java.util.List;

public class C03_passByeValue {

    public static void main(String[] args) {

        /*
        Bir list olusturalim iki ayri method'dan birinde sadece elemanlari degistirelim
        digerinde yeni bir list atayip ayni sayida yeni eleman ekleyelim.
        ve her iki method call'dan sonra kendi listemizi main method icerisinde
        kontrol edelim.
         */

        List<String> list = new ArrayList<String>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        System.out.println("Ilk bastaki list : " + list); // [Ali, Veli, Can]


        elemanlariDegistir(list);
        System.out.println("Eleman degistir method'undan sonra list : " + list); //  [Oguz, Murat, Fatih]

        listDegistir(list);
        System.out.println("list degistir method'undan sonra list : " + list); // [Oguz, Murat, Fatih]

    }

    public static void listDegistir(List<String> list) {

        list = new ArrayList<String>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");

        System.out.println("list degistir methodunda : " + list); // [Nutella, Cay, Cokokrem]

    }

    public static void elemanlariDegistir(List<String> list) {

        list.set(0, "Oguz");
        list.set(1, "Murat");
        list.set(2, "Fatih");

        System.out.println("Eleman degistir method'unda  list : " + list); // [Oguz, Murat, Fatih]
    }
}
