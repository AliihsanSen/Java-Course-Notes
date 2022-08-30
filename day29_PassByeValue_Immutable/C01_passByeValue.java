package day29_PassByeValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C01_passByeValue {

    public static void main(String[] args) {

        /*
        Dort elemanli bir array olusturalim.
        sonra ayri bir method'da bu arrayin 2. ve 4. elemanlarini
        100'den kucuk rastgele bir sayi ile degistirelim ve yeni halini yazdiralim
         */

        int[] arr = {5, 7, 8, 10};

        elemanDegistir(arr);

        System.out.println("Main method'un icinde diger method calistiktan sonra : " + Arrays.toString(arr));


    }

    public static void elemanDegistir(int[] arr) {

        Random rnd = new Random();
        arr[1] = rnd.nextInt(100);
        arr[3] = rnd.nextInt(100);

        System.out.println("Method'un icinde : "+Arrays.toString(arr)); // [5, 61, 8, 42]


    }
}
