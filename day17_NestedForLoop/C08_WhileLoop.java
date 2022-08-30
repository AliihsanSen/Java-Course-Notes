package day17_NestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan toplanmak uzere sayilar alın
        sayılarin toplami 500'ü gecince (500 dahil)
        sayilarin toplamını ve kaç sayı toplandığını
        şu şekilde yazdirin
        13 sayi girdiniz ve toplamlari 567
         */
        int toplam = 0;
        int sayi = 0;
        int sayac = 1;
        Scanner scan = new Scanner(System.in);

        while (toplam < 500) {
            System.out.print("Lutfen toplamak icin sayi giriniz: ");
            sayi = scan.nextInt();
            toplam += sayi;
            sayac++;
        }
        System.out.println(sayac-1 + " sayi girdiniz ve toplamlari: " + toplam);

    }
}
