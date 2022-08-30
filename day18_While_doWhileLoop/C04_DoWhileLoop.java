package day18_While_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        /*
        Kullanicidan tam sayilar alin.
        Kullanici cift sayi girdiği müddetce sayilari yazdirin.
        Tek sayi girdidiğinde islemi bitirin.
         */

        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        /*
        Loop'larda kullanacagimiz variable'lari loop'tan once olusturmalıyız.
        while loop'da loop'da once olusturdugumuz bu variable'a atayacagımız degeri
        iyi dusunmemiz gerekiyor.
         */


        // While loop ile yapalim.


        while (sayi % 2 == 0) {

            System.out.print("Lutfen bir adet sayı giriniz : ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girlen sayi tek, benden bu kadar : " + sayi);
            }
        }

        System.out.println(" "); // Alt satıra geçmesi için boş bir kere yazdırıyıoruz.


        // DO While loop ile yapalim :
        /*
        Do while loop'ta onceden olusturulan variable'a hangi deger atandıgının hiçbir
        onemi yok. Kodumuz her durumda calısır.

        - Do While'in dezavantajı:
        İlk calistirma kontrol yapilmadan oldugu icin
        loop'un body'sinde yanlıs bir islem yapılmamasına dikkat etmek gerekir.
         */

        do {
            System.out.print("Lutfen bir adet sayı giriniz : ");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift : " + sayi);
            } else {
                System.out.println("Girlen sayi tek, benden bu kadar : " + sayi);
            }
        } while (sayi % 2 == 0);


    }
}
