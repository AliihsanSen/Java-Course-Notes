package day38_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {

    public static void main(String[] args) {
        /*
        Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
        Kullaniciya index sorup, o index'deki urunu yazdiran bir program hazirlayalim
        Kullanici urun sayisindan buyuk bir index girerse exception vermesinin onune gecelim.
         */

        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Fındık"};
        Scanner scan = new Scanner(System.in);
        System.out.print("Istediginiz urunun sıra nosunu giriniz : ");
        int istenenIndex = 0;

        try {
            istenenIndex = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
            System.out.println(e);

            /*
            1. TRY KISMI: yapilmak istenen islem.
            2. Yakalanmasi istenen EXCEPTION turu ve yakalaninca icine konacak obje.
            3. CATCH BLOGU: problem yakalandigindan ne yapilacagi belirtilen bolum.
             */
        }


        /*
        Catch blogunun onundeki parantezde exception class'inin ismi ve yaninda
        yakalanan exception'i atadigimiz variable'in ismi olur (e)

        Eger yakalanan exception ile ilgili bilgileri kullaniciya vermek isterseniz
        bu objeyi kullanabilirsiniz.
        Eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa (e) kullanilmasa
        da kod calisir.
         */


        try {
            System.out.println("Aradıgınız urun : " + urunler[istenenIndex]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz index listemizde bulunmuyor"+
                    "\nsıra numarasi en fazla : "+ (urunler.length)+ " olabilir");
        }
    }
}
