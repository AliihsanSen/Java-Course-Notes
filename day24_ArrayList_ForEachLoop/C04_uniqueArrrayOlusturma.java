package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_uniqueArrrayOlusturma {
        /*
        Soru 2-)
        Verilen bir array'deki tekrar eden elementleri tek bir defa barindıran
        yeni bir array olarak donduren bir method olusturun.
         */

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};

        int[] uniqueArray = uniqueArrayOlustur(arr);

        System.out.print("uniqueArray = " + Arrays.toString(uniqueArray)); // uniqueArray = [1, 2, 3, 4, 5, 6, 9]
    }

    public static int[] uniqueArrayOlustur(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer> benzersizList = new ArrayList<Integer>();
        /*
        Yanindaki elemente esit olmayanlari listeye ekliyor.
         */
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                benzersizList.add(arr[i]);
            }

        }
        /*
        son elementi kontrol edip, yoksa listeye ekliyoruz.
         */

        if (!benzersizList.contains(arr[arr.length - 1])) {
            benzersizList.add(arr[arr.length - 1]);
        }
        /*
        benzersiz listenin size bilgisiniz kullanarak bir array olusturduk
         */

        int[] tekrarsizArr = new int[benzersizList.size()];

        /*
        benzerszi listedeki tum elemanlari, yeni arraye atadık
         */
        for (int i = 0; i < tekrarsizArr.length; i++) {
            tekrarsizArr[i] = benzersizList.get(i);
        }
        /*
        olusturdugumuz yeni array'i main method'a dondurduk.
         */

        return tekrarsizArr;
    }

}
