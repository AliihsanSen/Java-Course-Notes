package day19_Scope;

public class C02_StaticVariables {

    static int staticSayi = 10;

    String isim = "Mehmet";

    static int degersizStaticVar;
    int degersizInstanceVariable;

    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor.
     */



    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa
        objeler icin degil class icin gecerlidir.
         */

        System.out.println(staticSayi);  // 10
        staticMethod();

        staticSayi = 12;
        System.out.println(staticSayi); // 12

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi);
        /*
        İnstance bir variable degeriniin bulmak icin objenin olsuturulmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz.

        Static variable'da istte class'in en basindan baslayarak
        istenen satira kadar kodu takip edip
        static variable'in son degerini bulmamiz gerekir.
         */

    }

    public static void staticMethod() {
        System.out.println(staticSayi); // 10

    }

    public void staticOlmayanMethod() {

        /*
         Static variable'lar class icerisinden her yerden ulasılabilir.
         Static olsun veya olmasin tum method'lar static variable'lari gorebilir ve degistirebilirler.

         farkli methodlarda static variable'in hangi degeri alacagini bilmek istiyorsak
         class'in basindan itibaren kodun calismasini takip etmeliyiz.
         Method ne zaman cagrilirsa o anki static variable
         */

        System.out.println(staticSayi); // 12
        staticSayi = 20;



    }
}
