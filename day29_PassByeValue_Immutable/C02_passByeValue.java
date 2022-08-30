package day29_PassByeValue_Immutable;

import java.util.Arrays;
import java.util.Random;

public class C02_passByeValue {

    public static void main(String[] args) {

        /*
        Verilen dort elemanli bir array'i method'a gonderelim. Method'da yeni
        uc elamanli bir array atayip bu yeni array'e rastgele 100'den kucuk uc sayi atayalim
        Method'da array'i yazdiralim.

        Main method'da da method call'dan sonra yeniden method'u yazdiralim.
         */

        int[] arr = {3, 5, 8, 10};

        arrayiDegistir(arr);

        System.out.println("Method call'dan sonra main method'da array : " + Arrays.toString(arr));
            //  Method call'dan sonra main method'da array : [3, 5, 8, 10]

        /*
        --> Birden fazla element iceren arrat ve arrayList gibi yapilarda
            passByeValue gecerlidir.

        --> Eger method'da array veya list'in kendisi degistirilirse
            passByeValue ozelligi sebebiyle Java degisen degeri degil
            arry veya list'in orjinal degerini alir

         --> Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
         Java obje degismedigi icin ( referans ayni ), ayni array veya list'i bize
         dondurur ancak icindeki elementler degismis olacaktir.
         */

    }

    public static void arrayiDegistir(int[] arr) {

        arr = new int[3];

        Random rnd = new Random();

        arr[0] = rnd.nextInt(100);
        arr[1] = rnd.nextInt(100);
        arr[2] = rnd.nextInt(100);

        System.out.println("Method'da array : " + Arrays.toString(arr));
            // Method'da array : [22, 31, 91]


    }
}
