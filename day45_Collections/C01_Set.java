package day45_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {

    public static void main(String[] args) {

        /*
        Verilen bir array'deki tekrar eden elementleri silip tekrarsiz
        halini array'e atayan kod yaziniz.
         */
        int arr[] = {4, 5, 3, 6, 8, 5, 1, 9, 0, 4, 2, 5, 7, 9, 1, 2, 5, 7, 6};

        Set<Integer> tekrarsizSet = new HashSet<Integer>();

        for (int each : arr) {
            tekrarsizSet.add(each);
        }
        System.out.println("Set : " + tekrarsizSet); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] tekrarsizArr = new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsizArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int i = 0;
        for (int each : tekrarsizSet) {
            tekrarsizArr[i] = each;
            i++;
        }
        arr = tekrarsizArr;
        System.out.println("Bizim Array'in son hali : " + Arrays.toString(tekrarsizArr)); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}
