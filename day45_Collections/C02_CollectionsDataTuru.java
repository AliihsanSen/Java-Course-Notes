package day45_Collections;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {

    public static void main(String[] args) {
        /*
        Collections <DataTuru>'nu Object secmeniz durumunda Collection'a farkli
        data turlerinden objeler koymamiza izin verir.
        Bu depolama acisindan bize esneklik saglar.
        Ancak islem yaparken tum ıbjeleri Object olarak tanimladigimizdan cok fazla
        casting yapmamiz gerekebilir.
         */

        List<String> liste = new ArrayList();
        /*
        liste.add(5);
        liste.add('s');
        liste.add(true);
         */

        List<Object> list = new ArrayList();
        list.add(5);
        list.add(true);
        list.add('s');
        list.add("Ali");
        System.out.println(list); // [5, true, s, Ali]
        list.set(0, (Integer) list.get(0) + 5);
        System.out.println(list); // [10, true, s, Ali]
        list.set(3,list.get(3)+"Can");
        list.set(2,!(Boolean)list.get(2));

        Set<Object> set1 = new HashSet<Object>();
        set1.add(5);
        set1.add(true);
        set1.add('5');
    }
}
