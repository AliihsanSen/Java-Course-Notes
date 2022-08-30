package day17_NestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {

    public static void main(String[] args) {

         /*
         Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin.
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);

        String sifre = "";
        boolean sifreBasariliMi = false;
        int kontrol = 0;

        while (!sifreBasariliMi) {
            //Kullanıcidan bir sifre alalım
            System.out.println("Lütfen bir sifre giriniz :");
            sifre = scan.nextLine();
            // 4 tane kontrolu yapalım, her egecen
            // ilk harf kontrolü
            if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
                kontrol++;
            } else {
                System.out.println("ilk harf buyuk harf olmali :");
            }

            // son harf kontrolü
            if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
                kontrol++;
            } else {
                System.out.println("Son harf kucuk harf olmali :");
            }

            // bosluk kontrolü
            if (sifre.contains(" ")) {
                System.out.println("Sifre bosluk içermemeli :");
            } else {
                kontrol++;
            }

            // Sifre uzunluk kontrolü

            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("sifre uzunlugunu en az 8 harf olmalı :");
            }
            if (kontrol == 4) {// tum kontrollerden gecmis demektir.
                System.out.println("Sifre basarili bir sekilde tanımlandı. ");
                sifreBasariliMi = true;

            } else {// sifre basarisiz,
                    // tekrar basa donecek,
                    // kontrol variable sıfırlanmalı
                kontrol = 0;
            }


        }


    }
}
