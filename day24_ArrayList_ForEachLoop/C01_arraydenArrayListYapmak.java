package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arraydenArrayListYapmak {

    public static void main(String[] args) {

        String[] arr = {"Ismail", " Nurullah", "Fatih"};

        /*
        Uzun listeler olusturmamiz gerektiginde, tek tek eklemek yerine array olusturup
        bunlari list'e cevirmek daha pratik olabilir.

            1- loop ile array'deki tum elementleri list'e atabiliriz.
            2- Array.asList() kullanabiliriz.

                --> ancak bu method'un 2 tane kotu yan etkisi vardir.

                    **> Array class'i kullanildigi icin array ozellikleri gecerli olur
                    dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
                    bu sekilde olusturulan list'lerde kullanilmaz.

                    **> Kaynak olan array ile urun olan list ozdezlestirilir. birinde
                    yapilan degisiklik, otomatik olarak digerien de islenir.
         */


        List<String> sinifList = Arrays.asList(arr);

        System.out.println(sinifList);// [Ismail,  Nurullah, Fatih]

        List<Integer> sayilar = Arrays.asList(new Integer[5]);

        /*
         1. yan etki :
          sinifList.add("Erdi"); --> UnsupportedOperationException
          sinifList.remove(1); --> UnsupportedOperationException
         */

        /*
        2. yan etki :
         */

        arr[1] = "Emre";

        System.out.println("Degisim sonrasi array  : " + Arrays.toString(arr));
        // Degisim sonrasi array  : [Ismail, Emre, Fatih]

        System.out.println("Arrayi degistirince list : " + sinifList);
        // Arrayi degistirince list : [Ismail, Emre, Fatih]

        sinifList.set(0, "Utku");
        System.out.println("Listi degistirince list : " + sinifList);
        // Listi degistirince list : [Utku, Emre, Fatih]

        System.out.println("Listi degistirince array : " + Arrays.toString(arr));
        // Listi degistirince array : [Utku, Emre, Fatih]


    }
}
