package day23_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_arraydenListYapmak {

    public static void main(String[] args) {

        /*
        List ile calısırken en kotu ozelligi elemanlari tek tek eklemek.

         */

        Integer[] arr = {2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0};
        /*
        Bu kadar cok elemanli bir listeyi tek tek eleman olarak girmek yerine
        array olusturup, for loop ile olusturdugumuz list'e tasiyabiliriz.
         */

        List <Integer> sayilar = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++){
            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        bu islemi yapması icin Java'nin olusturdugu bir method da var
        ancak bu yontemin cok yan etkisi vardir.
            1- bu sekilde olusturulan listede add, remove gibi size'i degistiren method'lar
            KULLANILMAZ.
            2- asList method'u ile olusturulan liste ve kaynak olan array birbiri ile
            ilisik olarak hayatlarina devam ederler. birinde yaptigimiz deigisiklik
            otamatik olarak digerine de isler.


         */

        List <Integer> sayilar2 = Arrays.asList(arr);
        System.out.println(sayilar2); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar); //[2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]

        /*
        sayilar2.add(5);
        System.out.println(sayilar2); //UnsupportedOperationException

         */


        arr[0] = 20;
        System.out.println(Arrays.toString(arr));
        // [20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        System.out.println("Array'de degisiklik yapinca sayilar2 : "+ sayilar2);
        //Array'de degisiklik yapinca sayilar2 : [20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

    }
}
