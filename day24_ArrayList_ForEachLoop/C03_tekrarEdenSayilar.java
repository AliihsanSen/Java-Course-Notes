package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_tekrarEdenSayilar {
          /*
          Soru 1-)
          Verilen bir array'deki tekrar eden elementleri yazdirin
           */

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 3, 3, 4, 5, 5, 6, 6, 9]

        List<Integer> tekrarEdenler = new ArrayList<Integer>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && !tekrarEdenler.contains(arr[i])) {
                System.out.print(arr[i] + " ");
                tekrarEdenler.add(arr[i]);
            }
        }

    }
}
