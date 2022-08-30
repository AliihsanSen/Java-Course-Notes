package day03_scanner;

import java.util.Scanner;

public class C08_Scanner_ilkHarf {
    public static void main(String[] args) {
        // kullanicidan ismini alip ilk harfini büyük harf olarak yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        /*
        Java Scanner class'inde nextChar() methodu yoktur.
        Bunun Yerine String olarak ilk kelimeyi alip
        onunda ilk harfini alabiliriz.
         */

        char ilkHarf = scan.next().toUpperCase().charAt(0);
        System.out.println("İsmin ilk harfi :"+ ilkHarf);

    }
}
