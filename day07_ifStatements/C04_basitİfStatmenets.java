package day07_ifStatements;

import java.util.Scanner;

public class C04_basitİfStatmenets {

    public static void main(String[] args) {

        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin.
           Ornek    : gun = Pazar    output = "Hafta sonu"
                      gun = Sali    output = "Hafta içi"
                      ***Stirng içn equals method'unu kullanin
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir gun ismi giriniz");

        String girilenGun = scan.next().toLowerCase();

        // Pazar, pazar, PAZAR, PaZar, PAzar ??? bilemeyiz
        // pazar, pazar, pazar,

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("Girilen gun HAFTA SONU");
        }

        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") || girilenGun.equals("cuma")) {
            System.out.println("Girilen gun HAFTA İÇİ");
        }

        if (!(girilenGun.equals("pazartesi") || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") || girilenGun.equals("cuma") || girilenGun.equals("pazar")
                || girilenGun.equals("cumartesi"))) {
            System.out.println("Lütfen gecerli bir gun ismi giriniz");
        }


    }
}
