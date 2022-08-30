package day36_İnheritqnceDataTypeKullanimi;

public class EyanHizmetler extends BMuhasebe {

    protected int saatucreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yan Hizmetliler : " + (30 * saatucreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir.");
    }

    public static void main(String[] args) {
       /*
       --> Overriding child class'daki bir method'un parent class'daki ayni isimdeki
       method'u etkisiz hale getirerek kendisinin spesifik ozelligini ortaya cıkarmasıdır.

       --> Overriding'i nerede dikkate aliyoruz?
       bir obje olusturulurken data turu ve constructor farkli ise

       Eger bir obje olusturulurken data turu ve constructor farkli ise
       objenin ozelliklerini belirlerken 3 konuya dikkat cekmeliyiz.

            1- Obje constructor'ın oldugu class'da olusur.
            2- Obje'nin ozelliklerini aramaya data turunun oldugu class'dan baslariz.
               bu class'da aranan ozellik bulunamazsa parent class'lara bakilir. orada da
               bulamazsak o zaman CTE verir.

      ==> Eger aranan ozellik variable ise buldugumuz ilk degeri yazdiririz.

            3- Aranan ozellik method ise degeri yazdirmadan once override edilmis mi
               diye kontrol etmemiz gerekir
               Eger override edildiyse en guncel degeri yazdiririz.
       */

        BMuhasebe yh1 = new EyanHizmetler();
        System.out.println(yh1.gunlukMesai);  // M --> 8
        System.out.println(yh1.saatucreti); // M --> 10
        yh1.maas(); // YH --> Yan Hizmetliler : 2160 maas alir
        yh1.ozelSigorta(); // M --> Isteyen calisanlara %50 indirimli ozel sigorta yapilir.
        yh1.sigorta(); // Personel
        System.out.println(yh1.isim); // Personel
        System.out.println(yh1.soyisim); // Personel
        System.out.println(yh1.departman); // Personel
        /*
        System.out.println(yh1.issizlikSigorta); --> aramaya muhasebeden basladigimizdan
        issizlikSigortasi bulamadik CTE
         */




    }
}
