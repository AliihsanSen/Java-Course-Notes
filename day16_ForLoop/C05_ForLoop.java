package day16_ForLoop;

import java.util.Scanner;

public class C05_ForLoop {

    public static void main(String[] args) {

        /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
         sonucu yazdiran bir program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir adet sayi giriniz: ");
        int bas = scan.nextInt();

        System.out.print("Lutfen ikinci sayiyi giriniz: ");
        int bitis = scan.nextInt();

        aralariTopla(bas, bitis);

    }

    public static void aralariTopla(int bas, int bitis) {

        int toplam = 0;

        if (bas <= bitis) {
            for (int i = bas; i <= bitis; i++) {
                toplam += i;
            }
        } else {
            for (int i = bitis; i <= bas; i++) {
                toplam += i;
            }
        }

        System.out.print("Aradaki sayilarin toplami :" + toplam);
    }


}

