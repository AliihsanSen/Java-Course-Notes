package day08_ifStatements;

import java.util.Scanner;

public class C01_ifElseifStatements {

    public static void main(String[] args) {

        /*
        Soru 5) Kullanicidan gun ismini yazmasini isteyin.
        Girilen isim gecerli bir gun ise gun isminin 1.,2.
        ve 3.harfleriniilk harf buyuk diger ikisi kucuk
        olarak yazdirin, gun ismi gecerli degilse
        “Gecerli gun ismi giriniz” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gün ismi giriniz");
        String gun = scan.nextLine().toLowerCase();

        if (gun.equals("pazartesi")) {
            System.out.println("Paz");
        } else if (gun.equals("sali")) {
            System.out.println("Sal");
        } else if (gun.equals("çarşamba")) {
            System.out.println("Çar");
        } else if (gun.equals("perşembe")) {
            System.out.println("Per");
        } else if (gun.equals("cuma")) {
            System.out.println("Cum");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Cum");
        } else if (gun.equals("pazar")) {
            System.out.println("Paz");
        } else {
            System.out.println("Gecerli bir gün ismi giriniz");
        }

    }
}
