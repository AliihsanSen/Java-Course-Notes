package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini isteyin.
        // Girilen ismi
        // isminiz: Ali şeklinde yazdirin.

        // insanların dunyasindan kodlarimizin bulundugu class'a deger almak icin scanner class'ini kullanairiz.

        // 1- Scanner objesi olusturalim.
        Scanner scan = new Scanner(System.in);

        // 2- Kullaniciya ne istediginizi soyleyelim.
        System.out.println("Lutfen isminizi giriniz");

        // 3- oluşturduğumuz scan objesi ile kullanicinin girdiği degeri alip oluşturacagımmız uygun bir variable'a atayalim.

        String kullaniciIsmi = scan.next();


        System.out.println("Isminiz: " + kullaniciIsmi);

    }
}
