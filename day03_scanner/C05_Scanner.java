package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        /*
        Kullanicidan 2 sayi alip
        bu sayilarin çarpimini yazdirin.
         */

        // 1 adim- Scanner objesi oluşturmak.
        Scanner scan = new Scanner(System.in);

        //2 adim- Bilgi vermek
        System.out.println("Lütfen ilk sayiyi girin");

        //3 adim- Scan objesi ile almak
        double sayi1 = scan.nextDouble();

        //2. sayi için 2. ve 3. adimlari tekrarlariz.

        System.out.println("Lütfen ikinci sayıyı giriniz");
        double sayi2 = scan.nextDouble();

        System.out.println("Girilen sayiların çarpimi :" + sayi1 * sayi2);
    }
}
