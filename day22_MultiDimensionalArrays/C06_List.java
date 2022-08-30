package day22_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {

    public static void main(String[] args) {

        /*
        Array'i array yapan sembol [] idi.
        arraylist de ise <> (diamond) kullaniriz.
         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler); // []

        /*
        Bir list'e eleman eklemek istersek
         */

        isimler.add("Basak");
        System.out.println(isimler.add("Ayse")); // true doner.


        /*
        String'de bir method calistirdigimizda assign yapmazsak String degismez.

        String isim = "Suleyman"
        isim.toUpperCase(); --> sadece bu satir icin SULEYMAN
        sout(isim) --> Suleyman
         */

        System.out.println(isimler); // [Basak, Ayse]

        /*
        List'in tek kotu tarafi arrayy alt yapisini kullandigi icin elemanlari
        birer birer eklemek zorunda olmamizdir.
         */


    }
}
