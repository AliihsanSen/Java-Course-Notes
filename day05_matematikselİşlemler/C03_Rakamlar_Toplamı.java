package day05_matematikselİşlemler;

import java.util.Scanner;

public class C03_Rakamlar_Toplamı {
    public static void main(String[] args) {

        /*
        Kullanicidan 4 basamakli bir sayi alin ve
        rakamlar toplamini bulup yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 4 basamaklı bir sayı pozitif bir tam sayı giriniz");

        int sayi = scan.nextInt(); // örnek sayimiz 5267

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi = sayi;

        // suanda örnek sayimiz 5267, birlerBasamagi =0, rakamlarToplami = 0

        birlerBasamagi = sayi % 10; // 7

        rakamlarToplami += birlerBasamagi;

        sayi /= 10;

        // suanda sayi 526,  birlerBasamagi =7, rakamlarToplami = 7

        birlerBasamagi = sayi % 10; // 6
        rakamlarToplami += birlerBasamagi; // 13

        sayi /= 10;

        // suanda sayi 52,  birlerBasamagi =6, rakamlarToplami = 13

        birlerBasamagi = sayi % 10; // 2
        rakamlarToplami += birlerBasamagi; // 15

        sayi /= 10;

        // suanda sayi 5,  birlerBasamagi =2, rakamlarToplami = 15

        birlerBasamagi = sayi % 10; // 5
        rakamlarToplami += birlerBasamagi; // 20

        System.out.println(ilkGirilenSayi+ " " + "sayisinin rakamlar Toplami = " + rakamlarToplami);


    }
}
