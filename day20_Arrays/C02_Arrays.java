package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[] = new int[3];
        System.out.println(sayilar); // [I@19dfb72a
        /*
        non-primitive data turundeki datalari her zaman direk yazdiramayabiliriz.
        Array'i yazdirmak istersen Arrays class'indan yardim isteriz.
         */

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 3;
        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]

        String sınıfList[] = {"Ali", "Ayşe", "Ahmet"};
        System.out.println(Arrays.toString(sınıfList)); // [Ali, Ayşe, Ahmet]

        sınıfList[1] = "Hasan";
        System.out.println(Arrays.toString(sınıfList)); // [Ali, Hasan, Ahmet]

        System.out.println(sınıfList[1]); // Hasan'ı yazdiralim
        System.out.println(sınıfList[0]); // Ali'yi yazdiralim


    }
}
