package day07_ifStatements;

import java.util.Scanner;

public class C07_ifElseİfStatements {

    public static void main(String[] args) {

        /*
        bir önceki soruda kullanici negatif deger girerse uyaralim.
         */

        /*
        Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */

        /*
        NOT: birden fazla if - else if birbirine baglanmıssa
        son durum onemlidir.
        eger else ile bitiyorsa butun ihtimaller kapsaniyor demektir.
        ama else if ile bitiyorsa kapsanmayan durumlar olabilir.
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");

        int yaş = scan.nextInt();

        if (yaş<0){
            System.out.println("Lütfen gecerli bir yas yaziniz");
        } else if (yaş<65){
            System.out.println("Emekli olamazsın, calismalisin");
        } else{
            System.out.println("Emekli olabilirsin");
        }

    }
}
