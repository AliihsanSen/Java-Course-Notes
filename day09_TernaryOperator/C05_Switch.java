package day09_TernaryOperator;

import java.util.Scanner;

public class C05_Switch {

    public static void main(String[] args) {

        /*
        Kullanicidan gun numarasini alip
        1 ise pazartesi
        .
        .
        .
        7 ise pazar yazdiralim
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();

        /*
        Switch yanina yazilan ( ) neye gore  case atayacagımizi gosterir.
        javagirilen degere gore case'i bulur ve o satirdan calistirmaya baslar
        break yazisi gorunceye veya switch parantezine kadar devam eder.


        if- else if - ..... - else yapisinda oldugu gibi
        hicbir sarta uymayanlari default keyword kullanilir.

         */


        switch (gunNo) {

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli gun numarasi giriniz");
        }

    }
}
