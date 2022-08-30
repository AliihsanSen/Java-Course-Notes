package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForEachLoop {

    public static void main(String[] args) {

        /*
        Array'deki tum elemanlari inceleyelim, tek sayi olanlari list'e atayalim.
         */


        int[] arr = {2, 3, 4, 6, 23, 6, 8, 9, 1};
        List<Integer> liste = new ArrayList<Integer>();

        for (int each : arr // gelecek datalarin turu, loop icinde ne isim verdigim, nereden aldigim
            ) {
            if (each % 2 == 1){
                liste.add(each);
            }
        }
        System.out.println(liste);


    }
}
