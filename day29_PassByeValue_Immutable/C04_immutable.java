package day29_PassByeValue_Immutable;

public class C04_immutable {

    public static void main(String[] args) {

        /*
        Immutable : degistirilemez
        mutable   : degistirilebilir

        --> en meshur immutable class : String

         */
        String str = "Yildiz Bank";
        System.out.println(str.toUpperCase()); // YİLDİZ BANK

        str.toLowerCase();

        System.out.println(str); // Yildiz Bank

        str.substring(3, 5); // di --> sout olmadigindan yazdirmaz.

        /*
        Java'da string gibi metin ifadelerde kullanabileceğimiz
        mutable StringBuilder class'i da vardir.
         */

        StringBuilder sb = new StringBuilder("Java Bank");
        System.out.println(sb); // Java Bank

        sb.reverse();
        System.out.println(sb); // knaB avaJ

        sb.append(".");
        System.out.println(sb); // knaB avaJ.



    }
}
