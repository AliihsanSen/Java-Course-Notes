package day08_ifStatements;

import java.util.Scanner;

public class C02_ifElseifStatements {

    public static void main(String[] args) {

        /*
        Kullanıcıdan 100 üzerinden notunu isteyin.
        Not'u harf sistemine çevirip yazdırın.
        50'den kucukse "D",
        50-60 arasi"C",
        60-80 arası"B",
        80'nin uzerinde ise "A"
        Gecersiz not girildiginde uyarı verelim
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0'dan 100'e kadar bir not değeri giriniz ");
        double note= scan.nextDouble();

        if ((note < 0) || (note > 100)) {
            System.out.println("Lütfen gecerli bir not giriniz");
        }else if (note < 50) {  // Bu satira geldiysek notumuz 0 ile 100 arasindadır
            System.out.println("Harf notunuz : " + "D");
        } else if (note>= 50 && note < 60) { // Bu satira geldiysek notumuz 50 ile 60 arasindadır
            System.out.println("Harf notunuz : " + "C");
        } else if (note>= 60 && note < 80) { // Bu satira geldiysek notumuz 60 ile 80 arasindadır
            System.out.println("Harf notunuz :  + \"B\"");
        } else {
            System.out.println("Harf notunuz :" + "A");
        }

    }
}
