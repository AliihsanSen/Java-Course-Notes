package day21_Arrays;

public class C01_Arrays_MaxSayiBulma {

    public static void main(String[] args) {

     /*
     Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
      */

        int[] sayilar = {3, 5, 7, 1, 4, 9, 5, 2};

        maxSayiyYazdir(sayilar);


    }

    public static void maxSayiyYazdir(int[] sayilar) {

        int maxSayi = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > maxSayi) {
                maxSayi = sayilar[i];
            }
        }
        System.out.print("Arraydeki en buyuk sayi : " + maxSayi);


    }
}
