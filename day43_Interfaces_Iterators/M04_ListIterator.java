package day43_Interfaces_Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class M04_ListIterator {
    /*
    ListIterator Iterator interface'nin child interface'dir ma daha cok method'a sahiptir.
    */
    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println("liste = " + liste); // liste = [10, 20, 30]

        Integer temp;
        ListIterator lit1 = liste.listIterator();
        while (lit1.hasNext()) {
            temp = (Integer) lit1.next() + 3;
            lit1.set(temp);
        }
        System.out.println("liste = " + liste); // liste = [13, 23, 33]
    }

}
