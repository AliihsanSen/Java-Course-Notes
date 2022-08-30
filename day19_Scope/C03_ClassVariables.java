package day19_Scope;

public class C03_ClassVariables {

    public static void main(String[] args) {

        /*
        Farkli bir class'ta calısırken
        herhangi bir class adını yazıp (.)'ya basarsak
        adini yazdigimiz class'daki tum STATIC class uyelerini gorebilir ve kullanabiliriz.
         */

        C02_StaticVariables.staticMethod(); //10
        System.out.println(C02_StaticVariables.staticSayi); //10
        System.out.println(C02_StaticVariables.degersizStaticVar); //0

        /*
        Class level variable'lara deger atayip atamamak bıze kalmiştir
        istersek deger atamasi yapariz. istemezsek deger atamayiz
        Eger deger atamissak Java atadıgımmız o degeri kabul eder
        deger atamazsak Java bu variable'lara default bir deger atamasi yapar.
        int     ---> 0
        String  ---> null
        boolean ---> false
        char    ---> '' (hiclik)
         */

        /*
        Baska class'daki instanve variable'lara obje olusturarak ulasabiliriz.
         */

        C02_StaticVariables obje1 = new C02_StaticVariables();
        obje1.staticOlmayanMethod(); // 10
        // bu method icinde staticSayi = 20 oldu.

        System.out.println(obje1.isim); // Mehmet

        System.out.println(obje1.degersizInstanceVariable); // 0

        System.out.println(C02_StaticVariables.staticSayi); // 20

        /*
        Farkli bir class'dan C02 classindan method ve variable'lari kullandiginda
        C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir.
         */


    }

}
