package day10_StringManipulation;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Beni psikopata bağlamayin";

        System.out.println(str.toUpperCase()); // BENİ PSİKOPATA BAĞLAMAYIN

        System.out.println(str.toLowerCase()); // beni psikopata bağlamayın

        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));

        System.out.println(str.toUpperCase(Locale.CHINESE));

        /*
        eger buyuk - kucuk harf donusumunde local bir dil esas almak isterseniz bu method
        kullanılabilir.
         */

    }
}
