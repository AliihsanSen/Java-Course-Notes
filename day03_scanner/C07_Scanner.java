package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // Bir önceki soruyu tek seferde kullanicadan tüm bilgileri alarak yapiniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yaşinizi giriniz \n aralarda Enter tuşuna basiniz");

        // \n bu ifadenin sağında kalanlar bir alt satırda yazmaya başlar

        String isim = scan.nextLine();
        String soyisim = scan.next();
        double yaş = scan.nextDouble();

        System.out.println("Girilen bilgiler:" + isim + " " + soyisim + " " + yaş);

    }
}
