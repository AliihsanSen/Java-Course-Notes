package day07_ifStatements;

import java.util.Scanner;

public class C06_ifElseStatements {

    public static void main(String[] args) {

        /*
        Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise
        “emekli olamazsin, calismalisin”,
        65’e esit veya buyukse “Emekli olabilirsin” yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz");

        int yaş = scan.nextInt();

        if (yaş<65){
            System.out.println("Emekli olamazsın," + " " + (65 - yaş) + " yıl daha calismalisin");
        } else
            System.out.println("Emekli olabilirsin");


    }
}
