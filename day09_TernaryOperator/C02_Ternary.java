package day09_TernaryOperator;

import java.util.Scanner;

public class C02_Ternary {

    public static void main(String[] args) {

        /*
        Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse
        “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        /*
         Eger Ternary icindeki sonuclar farkli data turlerinde ise
         atama yapammayiz, sadece yazdirabiliriz.
         */


        /*
         String sonuc = (sayi > 0 ? "Sayi pozitif" : (sayi * sayi)); Hata verir
         double sonuc = (sayi > 0 ? "Sayi pozitif" : (sayi * sayi)); Hata verir
         */


        System.out.println(sayi > 0 ? "Sayi pozitif" : (sayi * sayi));

    }
}
