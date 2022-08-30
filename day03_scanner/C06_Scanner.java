package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini ve soyisimini ve yasini alip
        girilen bilgiler = seyfi capar 34 şeklinde yazdirin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String isim = scan.nextLine();
                /*
                String verileri scanner ile alirken next() [1 kelime] ve
                nextLine() [Satırın sonuna kadar ne yazarsan alir] kullanilabilir.
                NOT: eger art arda birden fazla String deger alacaksak nextLine() kullanmaliyiz.
                 */
        System.out.println("Lütfen soyisimini giriniz");

        String soyisim = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");

        double yaş = scan.nextDouble();

        System.out.println("Girilen bilgiler = " + isim + " " + soyisim + " " + yaş);


    }
}
