package day08_ifStatements;

import java.util.Scanner;

public class C03_nestedİfElseStatements {

    public static void main(String[] args) {

        /*
        Soru 1-) Emeklilik kontrolu yapan bir program yaziniz.
        Cinsiyet olarak E(erkek) veya K(Kadin) degiskenlerini kabul etsin
        farkli bir har veya sembol girilirse hata mesaji versin.

        emeklilik icin kadinlarda yas siniri 60
        erkeklerde yas siniri 65

        negatif yas veya 80'den buyuk yas girilirse hata mesaji versin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz \n Kadin icin K, Erkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");

        int yas = scan.nextInt();


        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli ys giriniz");
            } else if (yas < 65) {
                System.out.println("Emekli olamazsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("Gecerli ys giriniz");
            } else if (yas < 60) {
                System.out.println("Emekli olamazsin");
            } else {
                System.out.println("Emekli olabilirsin");
            }
        } else {
            System.out.println("Lutfen gecerli bir tercih yaziniz");
        }


    }
}
