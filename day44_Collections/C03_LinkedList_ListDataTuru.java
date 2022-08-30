package day44_Collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedList_ListDataTuru {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList();

        List<String> ll2 = new LinkedList();

        Queue<String> ll3 = new LinkedList();

        Deque<String> ll4 = new LinkedList();

        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");
        System.out.println(ll2); // [Berk, Done, Enes, Ayse]
        System.out.println(ll2.remove(3)); // Ayse
        /*
        Eger listemiz Integer elementlerden olusuyorsa direk sayi yazarsak index
        olarak kabul eder.
        Ama bir variable'a atama yapar ve remove'da o variable ismini yazarsak obje
        olarak kabul eder.
         */
        System.out.println(ll2.remove("Kemal")); // false
        System.out.println(ll2.isEmpty()); // false
        System.out.println(ll2.set(1, "Serap")); // Done
        System.out.println(ll2); // [Berk, Serap, Enes]

        ll1.add("Berk");
        ll1.add("Kamil");
        System.out.println(ll1); // [Berk, Kamil]

        ll2.retainAll(ll1);
        /*
        ll2'deki tum elementleri ll1 ile karsilastirir, ll1 de olmayanlari siler.
         */
        System.out.println(ll2); // [Berk]

        System.out.println(ll2.hashCode()); // 2066939
        ll2.add("Fatih");
        System.out.println(ll2.hashCode()); // 131726141


    }
}
